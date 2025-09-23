import java.util.Locale;
import java.util.Scanner;

public class CalcSim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Witaj w prostym kalkulatorze! Zostaniesz poproszony o wpisanie dwóch liczb i operatora, a następnie dostaniesz wynik operacji, którą wybrałeś.\n\n");

        System.out.print("Podaj pierwszą liczbę do działania: ");
        double num1 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Podaj symbol operacji (=, -, *, /): ");
        char operator = scan.next().charAt(0);
        System.out.print("Podaj drugą liczbę do działania: ");
        double num2 = scan.nextDouble();
        scan.nextLine();

        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Błąd: Nie można dzielić przez 0!");
                    break;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Błąd: Nieznany operator.");
                return;
        }

        System.out.print("\nWynik działania: ");
        printNumber(num1);
        System.out.printf(" %c ", operator);
        printNumber(num2);
        System.out.print(" = ");
        printNumber(result);

        System.out.println("\n\nNaciśnij Enter, aby zakończyć...");
        scan.nextLine();
    }

    private static void printNumber(double number) {
        if (number == (long) number) {
            System.out.print((long) number);
        } else {
            System.out.print(number);
        }
    }
}
