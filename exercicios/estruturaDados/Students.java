package exercicios.estruturaDados;

public class Students {
    public static void main (String[] args){
        String[] estudantes = {"Maria", "Tadeu", "Felicia", "Umberto", "Emilia"};
        System.out.println(estudantes[1]); // acessa elementos por indice. Output: Tadeu
        System.out.println(estudantes.length); //Informa o tamanho da lista.

        /*
            percorre a lista, mostrando cada item, a partir do indice 'i' 
        */
        for (int i =0; i< estudantes.length; i++){
            System.out.print(estudantes[i].concat(" "));
        };

         /*
           loop for/each é ideal para percorrer listas
        */
        for(String i: estudantes){
            System.out.println(i.concat("; "));
        };

        // como saber a menor e a maior idade a partir de uma lista?

        int[] idades = {23, 45, 12, 65, 3, 13};
        int menorIdade = idades[0];
        int maiorIdade = idades[0];

        for (int idade: idades){
            if (menorIdade> idade){
                menorIdade = idade;
            }
            else if(maiorIdade<idade){
                maiorIdade = idade;
            }
        }

        System.out.print("Maior idade: " +maiorIdade + " Menor Idade: " +menorIdade);
    }
    
}