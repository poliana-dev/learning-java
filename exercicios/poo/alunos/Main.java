package exercicios.poo.alunos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        Aluno alunoUm = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        alunoUm.nome_aluno = dados.nextLine();

        System.out.print("Digite o idade do aluno: ");
        alunoUm.idade_aluno = dados.nextInt();

        System.out.print("Digite a nota do aluno: ");
        alunoUm.nota_aluno= dados.nextInt();

        alunoUm.exibirInfo();
        dados.close();
    }
}
