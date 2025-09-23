import java.util.Scanner;

public class InstalmentCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price;
        int instalment;
        double monthlyFee;


        do {
            System.out.print("Jaka jest cena towaru? ");
            price = scan.nextDouble();
            if (price < 100 || price > 10000) System.out.println("Błąd! Cena nie mieści się w zakresie.");
        } while (price < 100 || price > 10000);

        do {
            System.out.print("Ile rat? (przyjmowany zakres 6-48) ");
            instalment = scan.nextInt();
            if (instalment < 6 || instalment > 48) System.out.println("Błąd! Liczba rat nie mieści się w zakresie.");
        } while (instalment < 6 || instalment > 48);

        if (instalment <= 12) monthlyFee = (price+price*0.025)/instalment;
        else if (instalment <= 24) monthlyFee = (price+price*0.05)/instalment;
        else monthlyFee = (price+price*0.1)/instalment;

        System.out.printf("Miesięczna rata wynosi: %.2f zł", monthlyFee);
    }
}