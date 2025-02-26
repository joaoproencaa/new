import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main (String[] args) {
        int numeroConta = 1;
        String agenciaConta = "a";
        String nomeCliente = "a";
        double saldoConta = 0.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        for(int i = 0; i < 4; i++){
            if(i==0){
                System.out.println("Olá! Digite o numero da sua conta: ");
                numeroConta = scanner.nextInt();
            }
            if (i==0 && numeroConta <= 0){
                System.out.println("Você digitou um número inválido, nulo ou negativo. Digite novamente: ");
                numeroConta = scanner.nextInt();
            }
            if(i==1){
                System.out.println("Certo. Agora, digite o numero da sua agencia: ");
                agenciaConta = scanner.next();
            }
            if (i==1 && agenciaConta == "a"){
                System.out.println("Você não digitou. Digite: ");
                agenciaConta = scanner.next();
            }
            if(i==2){
                System.out.println("Ok. Agora, digite o nome do titular da conta: ");
                nomeCliente = scanner.next();
            }
            if (i==2 && nomeCliente == "a"){
                System.out.println("Você não digitou. Digite: ");
                nomeCliente = scanner.next();
            }
            if(i==3){
                System.out.println("Por fim, digite o seu saldo bancário: ");
                saldoConta = scanner.nextDouble();
            }
        }

        System.out.println("Finalizando...\n");
        System.out.println(nomeCliente + ", obrigado por se registrar em nosso Banco. Repassando os dados:\n");
        System.out.println("NÚMERO DA CONTA: " + numeroConta);
        System.out.println("NÚMERO DA AGENCIA: " + agenciaConta);
        System.out.println("SALDO ATUAL:" + saldoConta);
        System.out.println("\nAté a próxima!");

    }
}