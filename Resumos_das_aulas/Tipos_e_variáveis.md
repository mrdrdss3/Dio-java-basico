# Sintaxe Java | Tipos e variáveis

## Tipos de dados

Palavras reservadas para a representação dos tipos de dados básicos.

São eles:
- byte (-128 até 128)
- short (-10^4 até 10^4)
- int (-10^9 até 10^9) // mais usado
- long (-10^18 até 10^18)
- float (valor "quebrado")
- double (dobro do float) // mais usado

Exemplos:

```
int idade = 25;
double salarioMinimo = 2500.33;
```

Obs: int e long não aceitam números que comecem com 0 e o float e o long devem possuir o F e o L, respectivamente, no final; exemplo:

```
float pi = 3.14F
long cpf = 12345678912L
```

## Variáveis e constantes

Constantes devem estar em caixa alta e devem ter a palavra "final" antes da declaração da variável.

Os dois códigos seguintes rodam:

```
int numero = 10;
 
numero = 9;

System.out.print(numero); 
```

```
double VALOR_DE_PI = 3.14;

VALOR_DE_PI = 10.75; // Vai alterar
```

Para não alterar o valor de PI colocamos:

```
final double VALOR_DE_PI = 3.14;
```

String representa o texto e char um caractere:

```
String nome = "Maria Eduarda";
char sexo = 'F' // aspas simples
```

PARA CRIAR LISTAS FAZEMOS:
```
String nomeArray[] = {"elementos","do","array","de uma string"};

int nomeDoArray[] = {1,2,3,4,5,5};
```