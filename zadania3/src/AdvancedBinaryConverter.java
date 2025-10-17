import java.util.Scanner;

public class AdvancedBinaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        int system;
        int[] zmBits = new int[32];

        System.out.print("Podaj liczbę całkowitą: ");
        userNumber = scan.nextInt();
        System.out.print("Wybierz system kodowania: ");
        system = scan.nextInt();


        int signBit = (userNumber < 0) ? 1 : 0;
        int absValue = Math.abs(userNumber);

        int bitCount = 0;
        while (bitCount < 32 && absValue > 0) {
            zmBits[bitCount] = absValue % 2;
            absValue /= 2;
            bitCount++;
        }

        int closestPower = (signBit == 1) ? closestPower(bitCount+1) : closestPower(bitCount);


        switch (system) {
            case 1:
                writeArray(closestPower, userNumber, zmBits, "zm", signBit);
                break;
            case 2:
                int[] zu1Bits = zu1Converter(closestPower, bitCount, signBit, zmBits);
                writeArray(closestPower, userNumber, zu1Bits, "zu1", signBit);
                break;
            case 3:
                int[] zu2Bits = zu2Converter(closestPower, bitCount, signBit, zmBits);
                writeArray(closestPower, userNumber, zu2Bits, "zu2", signBit);
                break;
            default:
                System.out.print("Błąd w wyborze systemu!");
        }
    }

    private static void writeArray(int closestPower, int userNumber, int[] array, String system, int signBit) {
        System.out.printf("Liczba %d binarnie w systemie %s: ", userNumber, system);
        if (signBit == 0) {
            for (int i = closestPower-1; i >= 0; i--) {
                System.out.print(array[i]);
            }
            System.out.println();
        } else {
            System.out.print(signBit);
            for (int i = closestPower-2; i >= 0; i--) {
                System.out.print(array[i]);
            }
            System.out.println();
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
