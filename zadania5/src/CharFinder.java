import java.util.Scanner;

public class CharFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        char z;

        System.out.print("Podaj słowo do sprawdznia: ");
        text = scan.next();
        System.out.print("Podaj znak do znalezienia: ");
        z = scan.next().charAt(0);

        int index = strpos(text, z, 0);
        if (index != -1)
            System.out.printf("Index na którym leży literka %c to %d.", z, index);
        else
            System.out.println(index);
    }

    static int strpos(String text, char z, int index) {
        if (index >= text.length()) return -1;

        if (text.charAt(index) == z) return index;

        return strpos(text, z, index+1);
    }
}
