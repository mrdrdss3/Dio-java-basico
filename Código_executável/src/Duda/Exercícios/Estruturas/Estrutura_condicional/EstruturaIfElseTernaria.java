package Duda.Exercícios.Estruturas.Estrutura_condicional;

public class EstruturaIfElseTernaria {
    public static void main(String[] args) {
        int nota = 5;
        String resultado = nota >= 7 ? "APROVADO" : "REPROVADO"; //composto
        String resultadoRec = nota >= 7 ? "APROVADO" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO"; // encadeado
        
        System.out.println(resultado);
        System.out.println(resultadoRec);
    }
}
