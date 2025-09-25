import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("Podaj liczbę całkowitą dodatnią: ");
            userNumber = scan.nextInt();
            if (userNumber < 1) System.out.println("Liczba powinna być dodatnia. Spróbuj jeszcze raz!");
        } while (userNumber < 1);

        int power = 0;
        int result;
        while ((result = (int)Math.pow(2, power)) <= userNumber) {
            System.out.println(result);
            power++;
        }
    }
}
