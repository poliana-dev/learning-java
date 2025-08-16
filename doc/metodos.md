---
marp: true
paginate: true
theme: default
---

# MÉTODOS JAVA

Conhecidos também como **funções**, são blocos de código que podem ser reaproveitados quando chamados.
- É possível passar parâmetros para um método.

***

## Como criar métodos?
- Métodos são criados dentro de uma classe.

Exemplo:
```java
public class Main(){
    static void MeuMetodo(){
        // seu código
    }
}
```
- `static`: significa que o método pertence ao Main e não é um objeto de classe.
- `void`: significa que não há um valor para ser retornado.
***
### Como chamar um método?
Exemplo:
```java
public class Main(){
    static void MeuMetodo(){
        // seu código
    }

    public static void main(String[] args){
        MeuMetodo();
    }
}
```

***
### Parâmetros e argumentos

Exemplo: 
```java
public class Idade{
    static void ChecarIdade(int idade){
        if (idade>=18){
            System.out.println("Você é maior de idade");
        }else if (idade<18){
            System.out.println("Você é menor de idade");
        }else{
            System.out.println("Erro");
        }
    }

    public static void main(String[] args) {
        ChecarIdade(12);
    }}
```
- O parâmetro é idade, seu argumento é 12.

***
Parâmetros com `return`:
```java
static int Soma(int a, int b){
    return a + b;
}

public static void main(String[] args) {
    // pratica recomendada
    int soma = Soma(2,4);
    System.out.println(soma);
        
}
```
- Note que deve ser informado o tipo primitivo a ser retornado antes da declaração do método, pois `void` não retorna valores.

***

### Sobrecarga de método
É importante quando surge a necessidade de ter um método que faz a mesma coisa, mas com tipo primitivo diferente.

***

Exemplo de código:
```java
public class Sobrecarga{
    static int Media(int n1, int n2){
        int soma = n1 + n2;
        int media = soma/2;
        return media; 
    }

    static float Media(float n1, float n2){
        float soma = n1 + n2;
        float media = soma/2;
        return media; 
    }

    public static void main(String[] args) {
        float mediaF = Media(24.6f,435.6f);
        int mediaI = Media(32,45);

        System.out.println("Media float: " + mediaF);
        System.out.println("Media inteira: " + mediaI);

    }
}
```
***
