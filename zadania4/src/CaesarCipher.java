import java.util.Scanner;

public class CaesarCipher {
    static String lowercaseAlphabet = "aąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż";
    static String uppercaseAlphabet = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPQRSŚTUVWXYZŹŻ";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj tekst do zaszyfrowania: ");
        String text = scan.nextLine();

        System.out.print("Podaj liczbę n (przesunięcie): ");
        int n = scan.nextInt();

        System.out.print("1 - Szyfruj\n2 - Odszyfruj\nWybierz system: ");
        int system = scan.nextInt();

        switch (system) {
            case 1:
                encrypt(text, n);
                break;
            case 2:
                decrypt(text, n);
                break;
            default:
                System.out.println("Nieznana operacja, spróbuj ponownie.");
        }
    }

    public static void encrypt(String text, int displacement) {
        StringBuilder encrypted = new StringBuilder();
        displacement %= 35;

        for (int i = 0; i < text.length(); i++) {
            char check = text.charAt(i);
            if (Character.isLetter(check)) {
                if (Character.isLowerCase(check)) {
                    int pos = lowercaseAlphabet.indexOf(check);
                    check = lowercaseAlphabet.charAt((pos+displacement)%35);
                } else {
                    int pos = uppercaseAlphabet.indexOf(check);
                    check = uppercaseAlphabet.charAt((pos+displacement)%35);
                }
            }
            encrypted.append(check);
        }
        System.out.println(encrypted);
    }

    public static void decrypt(String text, int displacement) {

        StringBuilder decrypted = new StringBuilder();
        displacement %= 35;

        for (int i = 0; i < text.length(); i++) {
            char check = text.charAt(i);
            if (Character.isLetter(check)) {
                if (Character.isLowerCase(check)) {
                    int pos = lowercaseAlphabet.indexOf(check);
                    check = lowercaseAlphabet.charAt((pos-displacement + 35)%35);
                } else {
                    int pos = uppercaseAlphabet.indexOf(check);
                    check = uppercaseAlphabet.charAt((pos-displacement + 35)%35);
                }
            }
            decrypted.append(check);
        }
        System.out.println(decrypted);
    }
}
