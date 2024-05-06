## Sintaxe Java

# Declaração de uma nova classe

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
