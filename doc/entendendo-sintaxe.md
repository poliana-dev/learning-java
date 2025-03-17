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

### Formas de contatenar variáveis

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
                String fullName = firstName + " " + lastName; //adcionei um espaço (deve ter outras formas)
                System.out.printIn("Hello " fullName);
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

- Só armazena valores lógicos ou caracteres:
    - `boolean`: Armazena 'true' ou 'false'
    - `char`: Armazena caracteres utilizando aspas simples.


### Não primitivos
_____wip_____










