public class TiposVariaveis {
    
    public static void main ( String [] args ){
        String concatenacao;
        int a, b;
        a = 2;
        b = 3;
        
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); // sai 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); // sai 1111

        concatenacao = 1+1+"1"+1;
        System.out.println(concatenacao); // sai 211

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); // sai 1111

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);
    }
}
