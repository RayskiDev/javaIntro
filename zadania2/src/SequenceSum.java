import java.util.Scanner;

public class SequenceSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNumberA, userNumberB;
        do {
            System.out.print("Podaj liczbę całkowitą A: ");
            userNumberA = scan.nextInt();
            System.out.print("Podaj liczbę całkowitą B (większą niż A): ");
            userNumberB = scan.nextInt();

            if (userNumberA >= userNumberB) System.out.println("B musi być większe od A. Spróbuj jeszcze raz.");
        } while (userNumberA >= userNumberB);

        int resultWhile = 0;
        int whileIter = userNumberA;
        while (whileIter <= userNumberB) {
            resultWhile += whileIter;
            whileIter++;
        }
        System.out.println("while result: " + resultWhile);

        int resultDoWhile = 0;
        int doWhileIter = userNumberA;
        do {
            resultDoWhile += doWhileIter;
            doWhileIter++;
        } while (doWhileIter <= userNumberB);
        System.out.println("do-while result: " + resultDoWhile);

        int resultFor = 0;
        for (int i = userNumberA; i <= userNumberB; i++) {
            resultFor += i;
        }
        System.out.println("for result: " + resultFor);
    }
}
