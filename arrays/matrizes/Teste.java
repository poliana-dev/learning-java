package arrays.matrizes;

public class Teste {
    public static void main(String[] args) {
        int [][] matriz = {{1,45,6}, {2, 5, 7, 8}};
        // System.out.println(matriz[1][3]);


        // para cada i (linha) em j (coluna)
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0 ; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            };
            System.out.println(); // pula a linha
        };

        
        for (int[] linha : matriz ){
            for (int i: linha){
                System.out.print(i + " ");
            } 
            System.out.println();
        }
    }
}
