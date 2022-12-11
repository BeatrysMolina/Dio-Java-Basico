package SintaxeJava.anatomiaclasses;

public class NomeCompleto {

        public static void main(String[] args) {

        String primeiroNome = "Beatrys";
        String segundoNome = "Molina";        

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.print (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        //return primeiroNome.concat(" ").concat(segundoNome);
    }
}