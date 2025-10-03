import java.util.Random;

public class RandomArrayOccurr {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] tablica = new int[20];
        int[] wystapienia = new int[10];

        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = generator.nextInt(10) + 1; // 1..10
            System.out.print(tablica[i] + " ");
            wystapienia[tablica[i]-1]++;
        }
        System.out.println();

        System.out.println("Wystąpienia:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + " - " + wystapienia[i]);
        }
    }
}
