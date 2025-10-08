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

        int index = 0;
        while (index < 32 && absValue > 0) {
            zmBits[index] = absValue % 2;
            absValue /= 2;
            index++;
        }

        int closestPower = closestPower(index);


        switch (system) {
            case 1:
                writeArray(closestPower, userNumber, zmBits, "zm", signBit);
                break;
            case 2:
                int[] zu1Bits = zu1Converter(closestPower, index, signBit, zmBits);
                writeArray(closestPower, userNumber, zu1Bits, "zu1", signBit);
                break;
            case 3:
//                zu2Converter();
                break;
            default:
                System.out.print("Błąd w wyborze systemu!");
        }
    }

    private static void writeArray(int closestPower, int userNumber, int[] zu1Array, String system, int signBit) {
        System.out.printf("Liczba %d binarnie w systemie %s: %d", userNumber, system, signBit);
        for (int i = closestPower-2; i >= 0; i--) {
            System.out.print(zu1Array[i]);
        }
    }

    private static int closestPower(int n) {
        double log2 = Math.log(n) / Math.log(2);
        int exponent = (int) Math.ceil(log2);
        return (int) Math.pow(2, exponent);
    }

    private static int[] zu1Converter(int closestPower, int index, int sign, int[] zmBits) {
        int[] zu1 = new int[closestPower];
        if (sign == 1) {
            for (int i = 0; i < closestPower; i++) {
                if (i >= index) {
                    zu1[i] = 1;
                    continue;
                }
                zu1[i] = (zmBits[i] == 0) ? 1 : 0;
            }
        } else {
            for (int i = 0; i < closestPower; i++) {
                if (i >= index) {
                    zu1[i] = 0;
                    continue;
                }
                zu1[i] = (zmBits[i] == 0) ? 1 : 0;
            }
        }
        return zu1;
    }
}
