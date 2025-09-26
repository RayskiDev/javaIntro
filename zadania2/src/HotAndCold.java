import java.util.Random;
import java.util.Scanner;

public class HotAndCold {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        int userNumber;

        int generatedNumber = generator.nextInt(100)+1;

        System.out.println("Wylosowałem liczbę z zakresu od 1 do 100, spróbuj ją zgadnąć!");

        int attemptIter = 0;
        do {
            System.out.print("Podaj swój typ: ");
            userNumber = scan.nextInt();
            attemptIter++;
            if (userNumber == generatedNumber) {
                System.out.println("\nGratulacje");
                System.out.println("Zgadłeś za " + attemptIter + " razem!");
                return;
            }
            else if (userNumber > generatedNumber) System.out.println("Podałeś za dużą wartość");
            else System.out.println("Podałeś za małą wartość");
        } while (true);
    }
}