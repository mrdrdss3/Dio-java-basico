package Duda.Exercícios.Terminal_e_argumentos;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = args [0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);

        System.out.println("Olá meu nome é " + nome + sobrenome);
        System.out.println("Eu tenho " + idade + "anos");
    }
}
