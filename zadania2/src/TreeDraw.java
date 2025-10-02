import java.util.Scanner;

public class TreeDraw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("Podaj liczbę całkowitą dodatnią: ");
            userNumber = scan.nextInt();
            if (userNumber < 1) System.out.println("Liczba powinna być dodatnia. Spróbuj jeszcze raz!");
        } while (userNumber < 1);

        for (int i = 1; i <= userNumber; i++) {
            for (int j = 0; j < userNumber - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


/*
        druga wersja na metodzie .repeat, którą znalazłem
        System.out.println();
        for (int i = 1; i <= userNumber; i++) {
            String spaces = " ".repeat(userNumber - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
*/
    }
}
