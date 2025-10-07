import java.util.Scanner;

public class AdvancedBinaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        int system;
        int[] bits = new int[32];

        System.out.print("Podaj liczbę całkowitą: ");
        userNumber = scan.nextInt();
        System.out.print("Wybierz system kodowania: ");
        system = scan.nextInt();

        switch (system) {
            case 1:
                zmConverter();
                break;
            case 2:
                zu1Converter();
                break;
            case 3:
//                zu2Converter();
                break;
            default:
                System.out.print("Błąd w wyborze systemu!");
        }


        int signBit = (userNumber < 0) ? 1 : 0;
        int absValue = Math.abs(userNumber);

        int index = 0;
        while (index < 32 && absValue > 0) {
            bits[index] = absValue % 2;
            absValue /= 2;
            index++;
        }


        static void zmConverter() {
            if (userNumber < 0) {
                for (int i = 0; i < index; i++) {
                    if (bits[i] == 1) bits[i] = 0;
                    else bits[i] = 1;
//                    zu1[i] = (zmBits[i] == 0) ? 1 : 0;
                }
            }
        }
    }
}
