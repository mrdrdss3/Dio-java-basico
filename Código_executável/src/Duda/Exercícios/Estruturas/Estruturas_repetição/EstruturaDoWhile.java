package Duda.Exercícios.Estruturas.Estruturas_repetição;

import java.util.Random;

public class EstruturaDoWhile {
    public static void main(String [] args){
        System.out.println("Discando...");
        do{
            //comando executado até o while ser falso
            System.out.println("Tocando");

        }
        while(tocando());{

            System.out.println("Alô!");
        }
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return ! atendeu;
    }
}
