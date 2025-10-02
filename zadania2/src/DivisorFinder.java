import java.util.Scanner;

public class DivisorFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int userNumber = scan.nextInt();

        if (userNumber == 0) {
            System.out.println("0 ma nieskończenie wiele dzielników.");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= userNumber; i++) {
            if (userNumber % i == 0) result.append(i).append(", ");
        }

        result.setLength(result.length() - 2);
        System.out.println(result);
    }
}
