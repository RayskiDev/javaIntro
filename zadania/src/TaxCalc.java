import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj swój dochód: ");
        double income = scan.nextDouble();
        double tax;

        if (income < 85528) {
            tax = income * 0.18 - 556.02;
        } else {
            tax = (income - 85528) * 0.32 + 14839.02;
        }

        System.out.println("\nPodatek wynosi: " + tax);
    }
}
