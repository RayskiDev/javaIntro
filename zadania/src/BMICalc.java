import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj swoją wagę (kg): ");
        double weight = scan.nextDouble();
        System.out.print("Podaj swój wzrost (cm): ");
        double height = scan.nextDouble();
        height /= 100;

        double bmi = weight / (Math.pow(height, 2));

        String bmiResult;

        if (bmi < 18.5) bmiResult = "niedowaga";
        else if (bmi < 24.9) bmiResult = "waga prawidłowa";
        else bmiResult = "nadwaga";

        System.out.println("\n" + bmiResult);
    }
}
