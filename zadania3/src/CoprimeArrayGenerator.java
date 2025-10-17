import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoprimeArrayGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowią (> 0): ");
        int userNumber = scan.nextInt();

        boolean[][] dataCube = new boolean[userNumber][userNumber];


        for (int i = 0; i < userNumber; i++) {
            for (int j = 0; j < userNumber; j++) {
                dataCube[i][j] = areCoprime(i+1, j+1);
            }
        }

        System.out.print("    ");
        for (int i = 1; i <= userNumber; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();

        for (int i = 0; i < userNumber; i++) {
            System.out.printf("%3d ", i+1);
            for (int j = 0; j < userNumber; j++) {
                System.out.printf("%3c ", (dataCube[i][j]) ? '+' : '.');
            }
            System.out.println();
        }
    }

    public static boolean areCoprime(int a, int b) {
        List<Integer> divisorsA = getDivisors(a);
        List<Integer> divisorsB = getDivisors(b);

        for (int dA : divisorsA) {
            if (dA > 1 && divisorsB.contains(dA)) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
