import java.util.Scanner;

public class StringToIntConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        System.out.print("Podaj słowo do zmiany: ");
        str = scan.next();

        int number = strToInt(str);
        System.out.println(number);
    }

    static int strToInt(String text) {
        if (text.isEmpty()) return 0;

        char check = text.charAt(0);

        if (Character.isAlphabetic(check)) return 0;


        return check + strToInt(text.substring(1));
    }
}
