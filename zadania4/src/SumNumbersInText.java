import java.util.Scanner;

public class SumNumbersInText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;

        System.out.print("Podaj słowo do sprawdzenia: ");
        userInput = scan.nextLine();

        int sum = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char check = userInput.charAt(i);
            if (Character.isDigit(check)) sum += check - '0';
        }

        System.out.println("Suma cyfr w tekście jest równa " + sum);
    }
}
