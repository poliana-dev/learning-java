package methods;

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
