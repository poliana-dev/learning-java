package exercicios.loops;
import java.util.Scanner;

public class Temp{
    public static void main(String[] args){
        Scanner temporizador = new Scanner(System.in);
        System.out.print("Digite os segundos do seu temporizador: ");

        int segundos = temporizador.nextInt();

        while(segundos>0){
            System.out.println(segundos);
            segundos--;
        }

        System.out.println("Atenção! Seu temporizador chegou ao fim!  ");
        temporizador.close();

    }
}