import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę nr " + (i+1));
            numbers[i] = scan.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < 3; i++) {
            if (max < numbers[i]) max = numbers[i];
            if (min > numbers[i]) min = numbers[i];
        }

        System.out.println("Najmniejsza liczba z podanych to: " + min + "\nNajwiększa liczba to: " + max);
    }
}
