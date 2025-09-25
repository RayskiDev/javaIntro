import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jaka temperatura do konwersji? (stopnie Celcjusza)");
        double celsius = scan.nextDouble();

        double farenheit = 1.8 * celsius + 32.0;

        System.out.println("Temperatura w stopniach Farenheita: " + farenheit);
    }
}
