import java.util.Scanner;

public class ParenthesesChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;

        System.out.print("Podaj tekst do sprawdzenia: ");
        userInput = scan.nextLine();

        int counter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);

            if (ch == '(') counter++;
            else if (ch == ')') counter--;

            if (counter < 0) {
                System.out.println("Błędne sparowanie nawiasów");
                return;
            }
        }

        if (counter == 0) System.out.println("OK");
        else System.out.println("Błędne sparowanie nawiasów");
    }
}
