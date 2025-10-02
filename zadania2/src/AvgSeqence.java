import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgSeqence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        List<Integer> numberArr = new ArrayList<>();

        do {
            System.out.print("Podaj liczbę całkowitą: ");
            userNumber = scan.nextInt();
            if (userNumber == 0) continue;
            numberArr.add(userNumber);
        } while (userNumber != 0);

        int min = numberArr.get(0);
        int max = numberArr.get(0);

        double avgSum = 0;
        for (int num : numberArr) {
            if (max < num) max = num;
            if (min > num) min = num;
            avgSum += num;
        }
        System.out.println("\nSuma największej i najmniejszej liczby wynosi: " + (min+max));
        System.out.printf("Średnia arytmetyczna ciągu wynosi: %.2f", (avgSum/numberArr.size()));
    }
}