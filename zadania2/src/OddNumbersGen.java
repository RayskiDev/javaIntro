import java.util.Scanner;

public class OddNumbersGen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("Podaj liczbę całkowitą dodatnią: ");
            userNumber = scan.nextInt();
            if (userNumber < 1) System.out.println("Liczba powinna być dodatnia. Spróbuj jeszcze raz!");
        } while (userNumber < 1);

        for (int i = 1; i <= userNumber; i += 2) {
            if (i + 2 <= userNumber) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
    }
}
