import java.util.Scanner;


public class sumFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userNumber;
        double userNumberSum = 0;

        do {
            System.out.print("Podaj liczbę: ");
            userNumber = scan.nextDouble();
            userNumberSum += userNumber;
        } while (userNumber != 0);

        System.out.println("Suma wszystkich wprowadzonych liczb różnych od 0 to: " + userNumberSum);
    }
}
