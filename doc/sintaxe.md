# ENTENDENDO A SINTAXE

Cada linha de código em Java deve estar dentro de um `class`
- As `{}` marcam o início e o fim de um código.
- A classe sempre tem que começar com letra maiúscula. 
- Java é **sensitive-case**. 
- O nome do arquivo **deve ser igual** o nome da classe.

---

### Método `main()`
- Todo programa em Java contém esse método, pois ele é importante para a execução do programa.
```java
    public static void main(String[] args) {
    System.out.println("Hello World");
    }

```
- A classe `System` é uma espécie de biblioteca Java, que junto com `out` e `printIn` farão a impressão de algo na tela.
- Lembre-se: Toda instrução de código termina com ( ; ) 

OBSERVAÇÃO: __Existe o método `print()`, mas ele não insere uma nova linha__ 
Exemplo de saída com o método `print()` : __Hello WorldEstou aprendendo Java, isso não é demais?__

### Como fazer comentários?

- Linha única: `//`
- Bloco de comentário: `/* */ `


***

## VARIÁVEIS EM JAVA

Tipos:
- `String`: Armazena texto. "Olá" 
- `int`: Armazena números inteiros. 123 ou -123
- `float`: Armazena números números inteiros ou decimais 
- `char`: armazena caracteres únicos, como 'a' ou 'B'. Valores char são cercados por *aspas simples*
- `boolean`: Armazena valores com dois estados: verdadeiro ou falso

Para criar uma variável é preciso declarar o __type__ e após nomear.

```java
    public class Main{
        public static void main(String[] args){
            String name = "Poliana";
            System.out.printIn(name);
        }
    }
```

Também pode declarar uma variável e depois atribuir valor.

```java
     public class Main{
        public static void main(String[] args){
            int numero;
            numero= 15;
            System.out.printIn(numero);
        }
    }

```
- OBSERVAÇÃO: Se você atribuir um novo valor a uma variável, o valor antigo será substituído.

### Variáveis `final`

- Se você não quer que a variável tenha valor alterado, basta adicionar `final` para declarar a variável como constante.

Exemplo:

```java
    final int numero = 15;
    numero = 20;  // isso vai gerar um erro
```

### Contatenação

- Primeira forma:
    ```java
        public class Main{
            public static void main(String[] args){
                String name = "Poliana";
                System.out.printIn("Hello " name);
            }
        }
    ```

- Segunda forma:
    ```java
        public class Main{
            public static void main(String[] args){
                String fistName = "Poliana";
                String lastName = "Pinheiro";
                String fullName = firstName + " " + lastName; //adcionei um espaço 
                System.out.printIn("Hello " fullName);
            }
        }
    ```

- Terceira forma (`concat()`):
    ```java
        public class Main{
            public static void main(String[] args){
                String fistName = "Poliana";
                String lastName = "Pinheiro";
                System.out.println("Testanto o metodo concat(): " + firstName.concat(" " + lastName));
                
            }
        }
    ```

OBSERVAÇÃO: Quando se trata de variáveis númericas o `+` é operador matemático  

### Como declarar variáveis múltiplas?


- Primeira forma com valores diferentes:
    ```java
        public class Main{
            public static void main(String[] args){
                int x = 2, y=3;
                System.out.println(x + y);
            }
        }
    ```

- Segunda forma com valores iguais:

    ```java
        public class Main{
            public static void main(String[] args){
                int a,b,c;
                a= b= c = 5;
                System.out.println(a+ b + c);

            }
        }
    ```

## TIPOS DE DADOS

Os tipos de dados de uma variável são divididos em dois grupos: Os primitivos e os não primitivos.

### Primitivos

Existem 8 tipos primitivos. São eles: `byte`, `int`, `short`, `long`, `float`, `double`, `boolean`, `char`.
- Esses tipos de dados especifica não só a variável como também os tipos de valores que ela pode armazenar.

- Só armazena números inteiros (positivos ou negativos):
    - `byte`: Pode armazenar números de -128 até 127. Apenas 8 bits, portando sua capacidade é apenas para números pequenos
    - `short`: Tamanho de 16 bits. Pode armazenar números de -32,768 até 32,767.
    - `int`: Tamanho de 32 bits. Pode armazenar números de -2,147,483,648 até 2,147,483,647. 
    - `long`: Tamanho de 64 bits. É absurdamente grande.

- Só armazena números decimais (e inteiros):
    - `float`: Pode armazenar números com uma precisão menor que o double. De 6 até 7 dígitos decimais.
    - `double`: Tem uma precisão maior que o float. De 15 até 16 dígitos decimais.

    OBSERVAÇÃO: O tipo `float` deve ter uma terminação *"f"* e o `double` deve ter a terminação *"d"* 
    Exemplo:
    ```java
        public class Main{
            public static void main(String[] args){
                float num= 3.4f;
                double num_dois= 0.378d;
                System.out.println(num);
                System.out.println(num_dois);
            }
        }
    ```

    - `double` é mais seguro para a maioria dos casos devido a sua precisão.
    É possível tratar números científicos adicionando o *"e"*
    Exemplo:
     ```java
        public class Main{
            public static void main(String[] args){
                float f1 = 35e3f; //35000.0 = 10 elevado a 3
                double d1 = 12E4d; //120000.0 = 10 elevado a 4
                System.out.println(f1);
                System.out.println(d1);
            }
        }
    ```

- Só armazena valores lógicos ou caracteres:
    - `boolean`: Armazena 'true' ou 'false'
    - `char`: Armazena caracteres utilizando aspas simples.


### Não primitivos

São chamados *tipos de referência*, pois se referem a objetos. São eles: `String`, `Arrays`, `Classes`

- Diferenças entre tipos primitivos e não primitivos:
    - Podem chamar métodos para executar operações.
    - Geralmente começam com letra maiúscula. Ex: `String`.
    - Podem ser `null`, diferente dos tipos primitivos.
    - São criados pelo programador, __exceto__ o tipo `String`.

### Casting em Java ("Conversão de tipos")

Se trata da conversão de um tipo primitivo para outro.
A conversão funciona na seguinte ordem:

- A conversão do *menor para o maior* ocorre __automaticamente__, e segue esta ordem:
    `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

    - Exemplo:
    ```java
        int ii = 877;
        double dd = ii;
        System.out.println(dd); // ocorre automatico, e sua saída é 877.0
    ```

- A conversão do *maior para o menor* deve ser feita __manualmente__, e segue esta ordem:
    `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

    Como converter? Basta colocar um `()` com o tipo primitivo que você deseja converter na frente do valor:

    - Exemplo:
    ```java
        short ss = 98;
        byte bb = (byte) ss; // manual
        System.out.println(bb);
    ```

## OPERADORES

- Aritméticos

    | Operador |    Nome            |    
    |  :---:   |     :---:          | 
    | + ou +=  |    Adição          |   
    | - ou -=  |    Subtração       |
    | * ou *=  |    Multiplicação   |
    | / ou /=  |    Divisão         |
    | % ou %=  |    Resto/Módulo    |
    | ++       |    Incremento      |
    | --       |    Decremento      |

- Comparação

    | Operador |    Nome                |    
    |  :---:   |     :---:              | 
    | ==       |    Igual a...          |   
    | !=       |    Diferente de...     |
    | >        |    Maior que...        |
    | <        |    Menor que...        |
    | >=       |    Maior ou igual a... |
    | <=       |    Menor ou igual a... |

- Lógicos

    | Operador |    Nome         |    
    |  :---:   |     :---:       | 
    | &&       |    AND          |   
    | \|\|     |    OR           |
    | !        |    NOT          |


## JAVA MATH

É um classe que possui vários métodos que permite a execução de tarefas matemáticas em números.

Alguns métodos bastante utilizados:

| Método    | Descrição                 |
| :---:     |      :---                 | 
|   max     | Encontrar o maior valor   |
|   min     | Encontrar o menor valor   |
|   sqrt    | Retornar a raiz quadrada  |
|   abs     | Retorna o valor absoluto (positivo) |
|   random  | Retorna um número aleatório | 


## CONDICIONAIS EM JAVA

Java possui as seguintes instruções de condição: `if` (se verdadeiro), `else` (se falso), `else if` (se verdadeiro, mas diferente de `if` ), e `switch` (troque caso for..)

Exemplo de `if`, `else` e `else if`:

```java
    class userInput{
        public static void main(String[] args){
            Scanner idade = new Scanner(System.in);
            System.out.println("Digite sua idade:");

            if (userAge<=18){ // se maior ou igual a 18
                System.out.println("Você é maior de idade");
            }
            else if (userAge>=18 && userAge<=29){ // se maior que 18 e menor que 29
                System.out.println("Você tem direito a carteira de estudante");
            } 
            else{ // se falso
                System.out.println("Você não é maior de idade");
            }

            
        }
    }
```

- Existe um modo curto de declarar `if/else` com o operador ternário:
    `int variavel = (condicao) ? verdadeiro :  falso;`
    Serve para economizar linhas e tempo.


    




   




    



















