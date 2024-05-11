package Duda.Exercícios.Estruturas.Estrutura_condicional;

public class EstruturaIfElseEncadeada {
    public static void main(String[] args) {
        int nota = 9;

        if( nota > 7){
            System.out.println("APROVADO");

        } else if ( nota < 7 && nota >= 5) {
            System.out.println("RECUPERAÇÃO");

        } else {
            System.out.println("REPROVADO");

        }
    }
}
