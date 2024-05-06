# Sintaxe Java

## Declaração de uma nova classe

OBS: Toda classe deve existir dentro do diretório src do projeto

```
public class MinhaClasse{
    //CÓDIGO
}
```
MinhaClasse - nome relacionado ao conteúdo dentro da classe. Nomenclatura coerente.

Se for uma classe executável ea deve possuir o main seguindo a seguinte forma:

```
public class MinhaClasse{

public static void main(String [] args) {

}

}
```

void - não retorna nada
Espera um parâmetro especial do tipo string
args - argumentos 

Para imprimir algo podemos fazer:

```
public class MinhaClasse{

public static void main(String [] args) {

    System.out.print("Ola, turma!");

}

}
```

System.out.print - o sistema vai fornecer uma saída (out) que será uma impressão (print); Dentro do parênteses temos o argumento que será impresso.

## Padrão de nomenclatura do arquivo

- O arquivo java deve começar com letra maiúscula como: Calculadora.java; CalculadoraCientífica.java
- A classe deve possuir o mesmo nome do arquivo.java

## Padrão de nomenclatura das variáveis

 - Devem ser escritas de letra minúscula, se for composta a segunda deve ser maiúscula, como: ano, anoFabricacao. (camelCase)
 - Variável que não sofre alteração de valor, deve estar em letra maiúscula:

 ```
 final String BR = "Brasil"
 int ESTADOS_BRASILEIROS = 27
 int ANO_2000 = 2000
 ```

 final - valor final, não pode sofrer alterações.
 - Não se inicia com um número, não possui espaço, nome único no escopo.

 ## Declarando variáveis e métodos

 VARIÁVEIS

 Deve seguir a seguinte estrutura:

 Tipo NomeBemDefinido = Atribuição

```
int idade = 23;
double altura = 1.35;
String meuNome = "Duda";
boolean verdadeira = true;
```

MÉTODOS

Deve seguir a seguinte estrutura:

public static TipoRetorno NomeObjetivoNoInfinitivo Parametro(n)

obs: o static pode variar, veremos futuramente.


```
public static int somar (int numeroUm, int numero2) {
    //código
}

public static String formatarCep (long cep){ 
    //código
}
```




