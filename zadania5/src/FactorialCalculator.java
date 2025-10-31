import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;

        System.out.print("Podaj liczę całkowitą: ");
        userInput = scan.nextInt();

        System.out.println("Silnia z " + userInput + " funkcją iteracyjną wynosi: " + factorialIterative(userInput));
        System.out.println("Silnia z " + userInput + " funkcją rekurencyjną wynosi: " + factorialRecursive(userInput));
    }

    public static int factorialIterative(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int number) {
        return number>1 ? number*factorialRecursive(number-1) : 1;
    }
}
