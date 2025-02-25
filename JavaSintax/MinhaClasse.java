public class MinhaClasse {
    
    public static void main (String [] args){
       // System.out.print("olá, turma");
        String primeiroNome = "Joao";
        String segundoNome = "Proenca";

        String nomeComposto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeComposto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    } // método: public static TipoDoRetorno NomeDoMétodo (parametros) {}
}