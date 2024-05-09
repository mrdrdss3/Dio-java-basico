# Sintaxe Java | Métodos e escopo

Todas as ações das aplicações são consideradas métodos.
São ações, funções ou sub-rotinas disponíveis dentro das nossas classes.

# Métodos

## Critérios de nomenclatura de métodos

- Nomeado como verbo
- camelCase

Exemplos:

```
abrirConexao(){}
somar(){}
```

## Critérios de definição de método

- Qual a proposta principal do método? Entenda a finalidade
- Qual o tipo de retorno do método? Retorna algum valor ou não (se não retornar utiliza void)
- Quais parâmetros são necessários para a execução do método?
- Apresenta alguma exceção?
- Qual a visibilidade do método?

Exemplo:

```
public class MyClass{

    public double somar (int num1, int num2){
        // lógica
        return ...;
    }
    public void imprimir (String texto){
        // lógica
        // não usa o return
    }
    private void metodoPrivado (){}

}
```

Quando um método recebe muitos parâmetros podemos gravar ele como um objeto.

# Escopo

Ambiente onde uma variável pode ser acessada, vai de acordo com o bloco que ela foi declarada. Onde ela é declarada influencia na sua visibilidade.
