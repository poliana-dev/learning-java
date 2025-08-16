package methods;

public class Idade{

    static void ChecarIdade(int idade){
        if (idade>=18){
            System.out.println("Você é maior de idade");
        }
        else if (idade<18){
            System.out.println("Você é menor de idade");
        }
        else{
            System.out.println("Erro");
        }
    }

    // para retornar valores, informa o tipo primitivo do metodo
    static int Soma(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        ChecarIdade(12);
        // pratica recomendada
        int soma = Soma(2,4);
        System.out.println(soma);
        
    }
}