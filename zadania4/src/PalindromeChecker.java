import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder userInput;

        System.out.print("Podaj słowo do sprawdzenia: ");
        userInput = new StringBuilder(scan.next());

        String palindromeCheck = new StringBuilder(userInput).reverse().toString();

        String result;
        if (userInput.toString().equals(palindromeCheck)) result = "jest palindromem";
        else result = "nie jest palindromem. W odwróceniu wygląda tak: " + palindromeCheck;
        System.out.println("Podane słowo " + result);
    }
}
