package poo.carros;

public class Carro{
    String nome;
    String marca;
    String cor;
    int ano;

    public void exibirInfoCarro(){
        System.out.println("\n\t--- Informações do Carro ---");
        System.out.print("Nome do carro: " + nome + "\nCor do carro: " + cor +  "\nMarca: "+ marca + "\nAno de lançamento: " + ano);
    }

    public void speed(int velocidade){
        System.out.println("Velocidade do carro: " + velocidade);
    }
}
