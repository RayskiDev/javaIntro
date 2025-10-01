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

        int min = numberArr.getFirst();
        int max = numberArr.getFirst();

        double avgSum = 0;
        for (int i = 0; i < numberArr.size(); i++) {
            if (max < numberArr.get(i)) max = numberArr.get(i);
            if (min > numberArr.get(i)) min = numberArr.get(i);
            avgSum += numberArr.get(i);
        }
        System.out.println("\nSuma największej i najmniejszej liczby wynosi: " + (min+max));
        System.out.println("Średnia arytmetyczna ciągu wynosi: " + (avgSum/numberArr.size()));
    }
}

//1, -4, 2, 17, 0.