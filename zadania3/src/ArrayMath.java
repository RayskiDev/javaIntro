import java.util.Random;
import java.util.Arrays;

public class ArrayMath {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] randNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            randNumbers[i] = generator.nextInt(21)-10;
        }

        int min = randNumbers[0];
        int max = randNumbers[0];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (max < randNumbers[i]) max = randNumbers[i];
            if (min > randNumbers[i]) min = randNumbers[i];
            sum += randNumbers[i];
        }

        double randAvg = (double)sum / 10;

        int smaller = 0, bigger = 0;
        for (int i = 0; i < 10; i++) {
            if (randNumbers[i] < randAvg) smaller++;
            if (randNumbers[i] > randAvg) bigger++;
            sum += randNumbers[i];
        }

        System.out.println("Wylosowane liczby:" + Arrays.toString(randNumbers));
        System.out.printf("Min: %d, max: %d\n", min, max);
        System.out.println("Średnia: " + randAvg);
        System.out.println("Mniejszych od średniej: " + smaller);
        System.out.println("Większych od średniej: " + bigger);

        for (int i = 0; i < randNumbers.length / 2; i++) {
            int t = randNumbers[i];
            randNumbers[i] = randNumbers[randNumbers.length - 1 - i];
            randNumbers[randNumbers.length - 1 - i] = t;
        }

        System.out.println("Liczby w odwrotnej kolejności:\n" + Arrays.toString(randNumbers));

    }
}