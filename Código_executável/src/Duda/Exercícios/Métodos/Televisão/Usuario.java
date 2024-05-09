package Duda.Exercícios.Métodos.Televisão;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV(); // Nova classe para a interação dos métodos
        
        //Estado da televisão

        System.out.println("TV ligada? " + smartTV.ligada );
        System.out.println("Canal atual: " + smartTV.canal );
        System.out.println("Volume atual: " + smartTV.volume );
        // println pula uma linha

        smartTV.ligar (); // Chama o método e executa ele
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada );
        
        smartTV.desligar (); // Chama o método e executa ele
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada );
        
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTV.volume );
    
        smartTV.trocarCanalEspecifico(12);
        System.out.println("Novo status -> Canal atual: " + smartTV.canal );
    }


}
