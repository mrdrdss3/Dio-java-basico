# Sintaxe Java | Operadores

## Classificação

- Atribuição (=) -> atribui um valor a uma variável

- Artiméticos (+, -, /, *, %(resto)) -> realiza operações matemáticas

OBS: a soma de strings realiza a concatenação dos textos

a concatenação pode obter resultados diferentes, com o + ocorre apenas quando ele identifica que é um caractere. exemplo:

```
String concatenacao = 1 + 1 + 1 + '1' // 31, enquanto o próximo valor for númerico ele vai somar e não concatenar
concatenacao = '1' + 1 + 1 + 1 // 1111
concatenacao = '1' + (1 + 1 + 1) // 13
```

- Unários -> realiza os trabalhos de incrementar (++), decrementar(--), inverter valores numéricos(+ ou -) e booleanos(!).

```
int numero = 5;
numero = - numero // resultado = -5;
numero = + numero // resultado = -5;
numero = numero * -1 // resultado = 5;
numero++; // resultado = 6; não deve ser feito na impressão ou deve-se colocar ++numero
numero--; // resultado = 5
```

Negar valores booleanos:

```
boolean variavel = !false;

System.out.print(variavel); // Resultado = true
```

- Ternário




