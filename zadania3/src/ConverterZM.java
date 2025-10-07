import java.util.Scanner;

public class ConverterZM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        int[] bits = new int[32];

        System.out.print("Podaj liczbę całkowitą: ");
        userNumber = scan.nextInt();

        int signBit = (userNumber < 0) ? 1 : 0;
        int absValue = Math.abs(userNumber);

        int index = 0;
        while (index < 32 && absValue > 0) {
            bits[index] = absValue % 2;
            absValue /= 2;
            index++;
        }

        System.out.printf("Liczba %d binarnie: %d.", userNumber, signBit);
        for (int i = index-1; i >= 0; i--) {
            System.out.print(bits[i]);
        }
    }
}
