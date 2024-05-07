package Duda.Exercícios.Operadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem " + "Java";
        
        System.out.print(nomeCompleto);

        int numero = 5;
        numero = - numero; // resultado = -5
        numero = + numero; // resultado = -5
        numero = numero * -1; // resultado = 5
        numero++; // resultado = 6; não deve ser feito na impressão ou deve-se colocar ++numero
        numero-- ;// resultado = 5
        System.out.println(numero);

        boolean variavel = !false;

        System.out.print(variavel); // Resultado = true
    }
}
