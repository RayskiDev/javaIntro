import java.util.Scanner;

public class EvenOddRatio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int userNumber = scan.nextInt();

        String digits = String.valueOf(Math.abs(userNumber));

        int sum = 0;
        int evenSum = 0, oddSum = 0;
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            sum += digit;

            if (digit % 2 == 0) {
                evenSum += digit;
                countEven++;
            } else {
                oddSum += digit;
                countOdd++;
            }
        }

        System.out.println("Suma cyfr: " + sum);

        if (countEven > 0 && countOdd > 0) {
            double avgEven = (double) evenSum / countEven;
            double avgOdd = (double) oddSum / countOdd;
            double ratio = avgEven / avgOdd;

            System.out.printf("Średnia cyfr parzystych: %.2f\n", avgEven);
            System.out.printf("Średnia cyfr nieparzystych: %.2f\n", avgOdd);
            System.out.printf("Stosunek średniej liczb parzystych do nieparzystych: %.2f\n", ratio);
        } else {
            System.out.println("Nie można obliczyć stosunku – brak cyfr jednej z grup.");
        }
    }
}
