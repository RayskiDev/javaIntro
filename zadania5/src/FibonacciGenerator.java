import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;

        System.out.print("Podaj liczę całkowitą: ");
        userInput = scan.nextInt();

        if (userInput <= 0) {
            System.out.println("Liczba powinna być dodatnia.");
            return;
        }

        System.out.println("Ciąg Fibonacciego funkcją iteracyjną: " + fibonacciIterative(userInput));
        System.out.println("Ciąg Fibonacciego funkcją iteracyjną: " + fibonacciRecursive(userInput));
    }

    public static List<Integer> fibonacciIterative(int number) {
        List<Integer> fibonacci = new ArrayList<>();

        if (number == 0) fibonacci.add(1);
        if (number == 1) fibonacci.add(1);

        if (!fibonacci.isEmpty()) return fibonacci;

        fibonacci.add(1);
        fibonacci.add(1);

        for (int i = 2; i < number; i++) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
        }
        return fibonacci;
    }

    public static List<Integer> fibonacciRecursive(int number) {
        if (number == 1) {
            return new ArrayList<>(List.of(1));
        } else if (number == 2) {
            return new ArrayList<>(List.of(1, 1));
        }

        List<Integer> fibonacci = fibonacciRecursive(number - 1);
        int size = fibonacci.size();
        fibonacci.add(fibonacci.get(size - 1) + fibonacci.get(size - 2));
        return fibonacci;
    }
}
