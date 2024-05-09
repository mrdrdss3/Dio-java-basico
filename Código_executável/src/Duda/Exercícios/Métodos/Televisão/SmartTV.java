package Duda.Exercícios.Métodos.Televisão;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 30;

    //Métodos que manipulam os estados, realiza as ações

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void trocarCanalMaior(){
        canal++;
    }
    public void trocarCanalMenor(){
        canal--;
    }
    public void trocarCanalEspecifico(int novoCanal){
        canal = novoCanal;
    }
}
