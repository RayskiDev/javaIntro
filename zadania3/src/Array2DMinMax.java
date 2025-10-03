import java.util.Arrays;
import java.util.Random;

public class Array2DMinMax {
    public static void main(String[] args) {
        Random generator = new Random();
        int[][] dataCube = new int[5][5];
        int[] minArray = new int[5];
        int[] maxArray = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dataCube[i][j] = generator.nextInt(11) - 5;
            }
        }

        for (int i = 0; i < 5; i++) {
            int min = dataCube[0][i];
            int max = dataCube[0][i];
            for (int j = 0; j < 5; j++) {
                if (dataCube[j][i] < min) min = dataCube[j][i];
                if (dataCube[j][i] > max) max = dataCube[j][i];
            }
            minArray[i] = min;
            maxArray[i] = max;
        }

        System.out.println("Macierz 5x5: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", dataCube[i][j]);
            }
            System.out.println();
        }

        System.out.println("Minima kolumn kolejno: " + Arrays.toString(minArray));
        System.out.println("Maksima kolumn kolejno: " + Arrays.toString(maxArray));
    }
}
