import java.util.Scanner;

public class RectangleDrawV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positionX, positionY, sizeA, sizeB;
        int[] variables = new int[4];
        String[] labels = {"pozycję X", "pozycję Y", "rozmiar ściany A", "rozmiar ściany B"};
        char sbl;

        for (int i = 0; i < 4; i++) {
            do {
                System.out.print("Podaj liczbę całkowitą wiekszą od 0 jako " + labels[i] + ": ");
                variables[i] = scan.nextInt();
                if (variables[i] < 1) System.out.println("Liczba powinna być dodatnia. Spróbuj jeszcze raz!");
            } while (variables[i] < 1);
        }

        System.out.print("Podaj znak do wypełnienia prostokątu: ");
        sbl = scan.next().charAt(0);

        positionX = variables[0];
        positionY = variables[1];
        sizeA = variables[2];
        sizeB = variables[3];
        String line = "> ";
        StringBuilder build = new StringBuilder(line);

        int positionXSum = positionX + sizeB;
        int positionYSum = positionY + sizeA;

        for (int i = 1; i < positionXSum; i++) {
            if (i < positionX) build.append("_");
            else build.append(sbl);
        }

        line = build.toString();

        for (int i = 1; i < positionYSum; i++) {
            if (i < positionY) System.out.println(">");
            else System.out.println(line);
        }
    }
}
