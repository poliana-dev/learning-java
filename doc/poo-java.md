---
marp: true
paginate: true
theme: default

---

# PROGRAMAÇÃO ORIENTADA A OBJETOS 
Diferente da programação procedural, que foca nos passos de execução (“como fazer”), a orientação a objetos organiza o código em classes (moldes) e objetos (instâncias dessas classes).

- Procedural: o foco está nas funções que manipulam dados.
- POO: o foco está nos objetos, que guardam dados e executam comportamentos.

***

## Classes e Objetos
A linguagem Java é toda baseada em POO. Sabemos que para criar uma classe basta: `public class Nomedaclase{}`. Mas como criar seus objetos dessa classe?

```java
public class Main {
    public static void main(String[] args) {
        Main meuObjeto = new Main(); // criou um objeto
        Main outroObjeto = new Main(); // é possível criar vários
    }
}
```

***
- É possivel, também, criar um objeto em uma classe em outras classes
    Exemplo:
    - No arquivo `Main.java`:
        ```java
        public class Main {
            int x = 5;
        }
        ```

    - Em outro arquivo temos a classe `Second.java`:
        ```java
        class Second {
            public static void main(String[] args) {
                Main meuObjeto = new Main();
                System.out.println(meuObjeto.x); // output: 5
            }
        }
        ```
> Ou seja, podemos podemos criar um objeto de uma classe e acessá-lo em outra.

***

## Métodos e Atributos

Já aprendemos como criar <ins>[métodos](metodos.md)</ins>. Logo, para criar atributos em Java:

 ```java
    public class Main {
        int idade = 20;
        String name = "Ana";
        boolean estudante = true;
    }
```
***
### `static` vs `public`
Para criar métodos, é preciso saber a diferença entre esses modificadores:
- `static`: não precisa de objeto para ser usado.
- `public`: precisam que um objeto seja criado antes de chamar.

***
```java
public class Main {
    // Método static 
    static void estatico() {
        System.out.println("Não precisa de objetos para serem usados");
    }
    // Método public
    public void publico() {
        System.out.println("Depedem de um objeto para serem usados");
    }  
    public static void main(String[] args) {
        estatico(); 
        // publico(); Gera erro

        Main myObj = new Main(); 
        myObj.publico(); // Maneira correta
    }
}
```
***

## Construtores

É um método importante que roda **automaticamente** ao criar um objeto de uma classe. Ele inicializa os atributos da sua classe.
- Evita repetir código.

Como definir um construtor:
```java
public class Aluno {
  int x; 
  public Aluno() {
    x = 5;  
  }

}
```
- Note que o método construdor não possui  tipo de retorno: `void`
***
- Pode ter multíplos parâmetros:
```java
public class Aluno {
    int idade;
    String nome; 

    public Aluno(int idadeAluno, String nomeAluno) {
        this.idade = idadeAluno;
        this.nome = nomeAluno;  
    }

    public static void main(String[] args) {
        Aluno alunoUm  = new Aluno(12, "Maria"); // criar objetos se tornou mais fácil
    }
}
```
- `this`: serve para referenciar o atributo da classe, e não ao parâmetro do construtor.

***

## Modificadores






