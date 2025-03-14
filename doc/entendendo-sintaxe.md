# ENTENDENDO A SINTAXE

Cada linha de código me Java deve estar dentro de um `class`
- As `{}` marcam o início e o fim de um código.
- A classe sempre quem que começar com letra maiúscula. 
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










