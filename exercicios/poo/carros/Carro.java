package exercicios.poo.carros;

public class Carro{
    String nome;
    String marca;
    String cor;
    int ano;

    public void exibirInfoCarro(){
        System.out.println("\n\t--- Informações do Carro ---");
        System.out.println("Nome do carro: " + nome + "\nCor do carro: " + cor +  "\nMarca: "+ marca + "\nAno de lançamento: " + ano);
    }

    public void speed(int velocidade){
        System.out.println("Velocidade do carro: " + velocidade);
        if (velocidade>=100){
            System.out.println("Seu carro está em " + velocidade + " por hora. Está muito veloz.");

        }else if (velocidade<=40){
             System.out.println("Seu carro está em " + velocidade + " por hora. Está muito lento.");
        }
    }
}
