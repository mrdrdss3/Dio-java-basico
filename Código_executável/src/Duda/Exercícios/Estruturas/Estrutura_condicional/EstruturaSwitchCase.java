package Duda.Exercícios.Estruturas.Estrutura_condicional;

public class EstruturaSwitchCase {
    public static void main(String[] args) {
        String sigla = "P";
        switch(sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }
        /* Se não colocar o break ele continua 
        os próximos cases, pode ser útil quando 
        temos planos e os mais caros possuem 
        mais vantagens, ao invés de colocarmos
        todo o texto no plano mais caro ele pode ir 
        "acoplando" na impressão; EXEMPLO:
        */
        String plano = "T";

        switch(plano){
            case "T":{
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }


        }
    }
}
