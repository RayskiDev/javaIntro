import java.util.Scanner;

public class LastLetterCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;

        System.out.print("Podaj słowo do sprawdznia: ");
        userInput = scan.next();
        char last = userInput.charAt(userInput.length()-1);

        int counter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == last) counter++;
        }

        String text;
        if (counter == 1) text = "raz";
        else text = "razy";
        System.out.printf("Literka '%c' w słowie '%s' występuje %d %s.\n", last, userInput, counter, text);
    }
}
