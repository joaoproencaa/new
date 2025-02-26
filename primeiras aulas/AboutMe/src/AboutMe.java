public class AboutMe {

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Por favor, forneça nome, sobrenome, idade e altura.");
            return;
        }

        String nome = args[0];
        String sobrenome = args[1];
        int idade;
        double altura;

        try {
            idade = Integer.parseInt(args[2]);
            altura = Double.parseDouble(args[3]);
        } catch (NumberFormatException e) {
            System.out.println("Idade e altura devem ser números válidos.");
            return;
        }

        System.out.println("Oi! Eu me chamo " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos de idade e " + altura + " metros de altura");
    }
}