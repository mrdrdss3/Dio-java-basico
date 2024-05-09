package Duda.Exercícios.Terminal_e_argumentos;

import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        //criando objeto scanner
        // recebe os valores pelo terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Olá meu nome é " + nome + " " +sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
    }
}
