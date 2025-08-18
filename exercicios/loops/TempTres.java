package exercicios.loops;
import java.util.Scanner;

public class TempTres {
    public static void main(String[] args){
        Scanner temporizador = new Scanner(System.in);
        System.out.print("Digite os segundos do seu temporizador: ");
        int segundos = temporizador.nextInt();
        temporizador.close();

        for ( ; segundos>0; segundos--) {
            System.out.println(segundos);
        }

        System.out.println("Atenção! Seu temporizador chegou ao fim!  ");
       
    }
}
