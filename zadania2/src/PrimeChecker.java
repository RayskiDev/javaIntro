import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int userNumber = scan.nextInt();

        if (userNumber <= 1 || userNumber == 2) {
            if (userNumber == 2) System.out.println("Najmniejsza liczba pierwsza.");
            else System.out.println("Liczba nie jest pierwsza.");
            return;
        }

        int divisors = 0;
        for (int i = 1; Math.pow(i,2) <= userNumber; i++) {
            if (userNumber % i == 0) {
                divisors++;
                if (i != userNumber / i) divisors++;
            }
        }

        if (divisors != 2) System.out.printf("Liczba %d nie jest pierwsza. \nLiczba dzielników: %d\n", userNumber, divisors);
        else System.out.printf("Liczba %d jest liczbą pierwszą.", userNumber);
    }
}
