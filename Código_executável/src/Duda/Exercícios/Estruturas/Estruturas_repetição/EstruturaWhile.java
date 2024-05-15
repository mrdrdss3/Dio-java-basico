package Duda.Exercícios.Estruturas.Estruturas_repetição;

import java.util.concurrent.ThreadLocalRandom;

public class EstruturaWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int qtdDoce = 0;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            
            System.out.println("O doce custa: " + valorDoce + " e João tem: " + mesada);
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            
            mesada = mesada - valorDoce;
            qtdDoce += 1; 
        }

        System.out.println("A quantidade de doces que João comprou foi: " + qtdDoce);
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
