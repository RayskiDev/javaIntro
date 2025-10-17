import java.util.Scanner;

public class BinaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber1, userNumber2;
        int system;

        System.out.print("Podaj liczbę całkowitą: ");
        userNumber1 = scan.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        userNumber2 = scan.nextInt();
        System.out.print("Wybierz system kodowania: ");
        system = scan.nextInt();
        System.out.println();

        int sum = userNumber1 + userNumber2;
        int diff = userNumber1 - userNumber2;
        String systemPrint = ((system == 1) ? "ZM" : (system == 2) ? "ZU1" : "ZU2");

        System.out.printf("Dodawanie %d i %d w systemie %s: \n", userNumber1, userNumber2, systemPrint);
        printInSystem(userNumber1, system);
        System.out.print(" + ");
        printInSystem(userNumber2, system);
        System.out.print(" = ");
        printInSystem(sum, system);
        System.out.println();


        System.out.printf("Odejmowanie %d i %d w systemie %s: \n", userNumber1, userNumber2, systemPrint);
        printInSystem(userNumber1, system);
        System.out.print(" - ");
        printInSystem(userNumber2, system);
        System.out.print(" = ");
        printInSystem(diff, system);
        System.out.println();
    }

    private static void printInSystem(int number, int system) {
        int[] zmBits = new int[32];
        int signBit = (number < 0) ? 1 : 0;
        int absValue = Math.abs(number);

        int bitCount = 0;
        while (bitCount < 32 && absValue > 0) {
            zmBits[bitCount] = absValue % 2;
            absValue /= 2;
            bitCount++;
        }

        int closestPower = (signBit == 1) ? closestPower(bitCount+1) : closestPower(bitCount);


        switch (system) {
            case 1:
                writeArray(closestPower, zmBits, signBit);
                break;
            case 2:
                int[] zu1Bits = zu1Converter(closestPower, bitCount, signBit, zmBits);
                writeArray(closestPower, zu1Bits, signBit);
                break;
            case 3:
                int[] zu2Bits = zu2Converter(closestPower, bitCount, signBit, zmBits);
                writeArray(closestPower, zu2Bits, signBit);
                break;
            default:
                System.out.print("Błąd w wyborze systemu!");
        }
    }

    private static void writeArray(int closestPower, int[] array, int signBit) {
        if (signBit == 0) {
            for (int i = closestPower-1; i >= 0; i--) {
                System.out.print(array[i]);
            }
        } else {
            System.out.print(signBit);
            for (int i = closestPower-2; i >= 0; i--) {
                System.out.print(array[i]);
            }
        }
    }

    private static int closestPower(int n) {
        double log2 = Math.log(n) / Math.log(2);
        int exponent = (int) Math.ceil(log2);
        return (int) Math.pow(2, exponent);
    }

    private static int[] zu1Converter(int closestPower, int bitCount, int sign, int[] zmBits) {
        int[] zu1 = new int[closestPower];
        if (sign == 1) {
            for (int i = 0; i < closestPower; i++) {
                if (i < bitCount) zu1[i] = (zmBits[i] == 0) ? 1 : 0;
                else zu1[i] = 1;
            }
        } else {
            for (int i = 0; i < closestPower; i++) {
                if (i < bitCount) zu1[i] = zmBits[i];
                else zu1[i] = 0;
            }
        }
        return zu1;
    }

    private static int[] zu2Converter(int closestPower, int bitCount, int sign, int[] zmBits) {
        int[] zu2 = zu1Converter(closestPower, bitCount, sign, zmBits);
        if (sign == 1) {
            int carry = 1;
            for (int i = 0; i < closestPower; i++) {
                int sum = zu2[i] + carry;
                zu2[i] = sum % 2;
                carry = sum / 2;
                if (carry == 0) break;
            }
        } else {
            for (int i = 0; i < closestPower; i++) {
                if (i < bitCount) zu2[i] = zmBits[i];
                else zu2[i] = 0;
            }
        }
        return zu2;
    }
}
