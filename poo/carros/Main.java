package poo.carros;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        Carro carroUm = new Carro();
        //Carro carroDois = new Carro();
        
        System.out.print("Digite o nome do carro: ");
        carroUm.nome = dados.nextLine();

        System.out.print("Digite o ano de lançamento: ");
        carroUm.ano = Integer.parseInt(dados.nextLine()); 
        /* 
         * Integer.parseInt(dados.nextLine()); ---> converte uma String em um número inteiro, pois depois de nextLine(), o ano fica string ao inves de int
         * essa combinação lê a linha digitada pelo usuário como string e imediatamente converte para inteiro. 
         * Alem disso, evita o problema do nextInt() que deixa uma quebra de linha sobrando no buffer do Scanner.
        */

        System.out.print("Digite a cor do carro: ");
        carroUm.cor = dados.nextLine();

        System.out.print("Informe a marca do carro: ");
        carroUm.marca = dados.nextLine();

        carroUm.exibirInfoCarro();
        dados.close();



    }
}
