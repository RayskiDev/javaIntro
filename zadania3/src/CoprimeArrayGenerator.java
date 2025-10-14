import java.util.Scanner;

public class CoprimeArrayGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowią (> 0): ");
        int userNumber = scan.nextInt();

        boolean[][] dataCube = new boolean[userNumber][userNumber];

        for (int i = 0; i < userNumber; i++) {
            for (int j = 0; j < userNumber; j++) {
                if (i == 0 || j == 0) {
                    dataCube[i][j] = true;
                    continue;
                }
                if ((i+1) % (j+1) != 0) dataCube[i][j] = true;
                if ((j+1) % (i+1) != 0) dataCube[i][j] = true;
            }
        }

        for (int i = 0; i < userNumber; i++) {
            for (int j = 0; j < userNumber; j++) {
                System.out.printf("%3c ", (dataCube[i][j]) ? '+' : '.');
            }
            System.out.println();
        }
    }
}
