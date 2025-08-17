# CLASSES DO JAVA 

Neste tópico iremos tratar a **Programação Orientada a Objetos**, que tem como objetivo criar objetos que contenham dados/"caracteristicas" e métodos/"ações".

Benéficios da OOP/POO:
- Rápido e fácil de executar
- Fornece estrutura para os programas
- Mantém o código limpo, que faz ser mais fácil de manter, depurar e modificar
- Reutilização

## USER INPUT 

Para a entrada do usuário utilizamos a classe `Scanner`, encontrada no pacote `java.util`.

### Tipos de entrada

Segue alguns métodos de entrada da classe `Scanner`.

|   Método              |  Descrição                    |
|   `nextBoolean()`     | Para ler um valor booleano    |
|   `nextByte()`        | Para ler um valor byte        |
|   `nextInt()`         | Para ler um valor inteiro     |
|   `nextLine()`        | Para ler um valor texto       |

- Existem outros para cada caso específico

Exemplo:
```java
    import java.util.Scanner; //importe a biblioteca
    
   class userInput{
        public static void main(String[] args){
            Scanner nome = new Scanner(System.in);  //crie um objeto scanner; Entrada do teclado
            System.out.print("Digite o nome: ");
        
            String userName = nome.nextLine();  // para ler o objeto
            System.out.println("Seu nome de usuário é: " + userName);  
            nome.close() // é como fechar uma torneira de água haha
    }
}   
```
