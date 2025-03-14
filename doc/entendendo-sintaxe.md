# ENTENDENDO A SINTAXE

Cada linha de código me Java deve estar dentro de um `class`
- As `{}` marcam o início e o fim de um código.
- A classe sempre quem que começar com letra maiúscula. 
- Java é **sensitive-case**. 
- O nome do arquivo **deve ser igual** o nome da classe.

### Método `main()`
- Todo programa em Java contém esse método, pois ele é importante para a execução do programa.
```java
    public static void main(String[] args) {
    System.out.println("Hello World");
    }

```
- A classe `System` é uma espécie de biblioteca Java, que junto com `out` e `printIn` farão a impressão de algo na tela.
- Lembre-se: Toda instrução de código termina com ( ; ) 

- OBSERVAÇÃO: __Existe o método `print()`, mas ele não insere uma nova linha__ 
Exemplo de saída com o método `print()`
```
    Hello WorldEstou aprendendo Java, isso não é demais?
```