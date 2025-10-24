import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder userInput;

        System.out.print("Podaj słowo do odwrócenia: ");
         userInput = new StringBuilder(scan.next());

         userInput.reverse();

         System.out.println(userInput);
    }
}
