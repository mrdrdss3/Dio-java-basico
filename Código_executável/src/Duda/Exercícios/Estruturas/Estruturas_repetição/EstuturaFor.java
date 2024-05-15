package Duda.Exercícios.Estruturas.Estruturas_repetição;

public class EstuturaFor {

    public static void main(String [] args){
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos + "- Carneirinhos");
        }
        /*Podemos colocar também 
        for(int carneirinhos = 0; carneirinhos < 20; carneirinhos++)
        */
        String alunos[] = {"Antonio", "Jonas", "Julia","Duda"};

        for (int x = 0; x < alunos.length; x++){
           System.out.println("O(A) aluno(a) " + alunos[x] + " tem o índice x=" + x);
        }

        // Outra forma de usar o for
        // "Tradução": A string aluno vai receber cada elemento do array alunos por vez
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

        // Teste com o Array de números inteiros
        int nomeDoArray[] = {1,2,3,4,5,5};

        for (int i = 0; i < nomeDoArray.length; i++){
            System.out.println("O elemento no índice i = " + i + " é o " + nomeDoArray[i]);
        }
    }

}