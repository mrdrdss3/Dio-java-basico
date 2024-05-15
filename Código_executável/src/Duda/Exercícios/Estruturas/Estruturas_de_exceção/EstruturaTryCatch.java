package Duda.Exercícios.Estruturas.Estruturas_de_exceção;

import java.util.InputMismatchException;

public class EstruturaTryCatch {
    public static void main(String [] args){
        try{
            //bloco de código conforme o esperado
        }
        catch(InputMismatchException e) {
            // bloco de códifo que captura as exceções que podem acontecer
            // em caso de um fluxo não previsto
            //Se eu recebi uma string no lugar de um inteiro por exemplo
            System.out.println("O campo x precisa precisar ser um número inteiro");
        }   
    }
}
