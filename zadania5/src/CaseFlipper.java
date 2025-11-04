import java.util.Scanner;

public class CaseFlipper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;

        System.out.print("Podaj słowo do zmiany: ");
        text = scan.next();

        String flippedText = flipCase(text);
        System.out.printf("Oryginał %s, odwrócony %s", text, flippedText);
    }

    static String flipCase(String text) {
        if (text.isEmpty()) {
            return "";
        }

        char check = text.charAt(0);

        if (Character.isLowerCase(check)) check = Character.toUpperCase(check);
        else check = Character.toLowerCase(check);

        return check + flipCase(text.substring(1));
    }
}
