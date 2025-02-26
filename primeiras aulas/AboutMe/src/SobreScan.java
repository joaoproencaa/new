import java.util.Locale;
import java.util.Scanner;

public class SobreScan {

    public static void main (String[] args) {
        // CRIANDO O OBJETO SCANNER
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Oi! Eu me chamo " + nome);
        System.out.println("Minha altura eh " + altura + " m.");
        System.out.println("Minha idade eh " + idade + " anos.");
    }
}
