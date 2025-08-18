package exercicios.loops;
import java.util.Scanner;

// estrutura de do/while

public class TempDois{
    public static void main(String[] args){
        Scanner temporizador = new Scanner(System.in);
        System.out.print("Digite os segundos do seu temporizador: ");

        int segundos = temporizador.nextInt();

        do{
            System.out.println(segundos);
            segundos--;
        }while(segundos>0);

        System.out.println("Atenção! Seu temporizador chegou ao fim!  ");
        temporizador.close();

    }
}
