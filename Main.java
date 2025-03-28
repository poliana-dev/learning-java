public class Main{
    public static void main(String[] args){
        // Como imprimir
        System.out.println("Hello World");
        System.out.println("Estou aprendendo Java, isso não é demais?");
        System.out.println(3+3);

        // Primeira variável 
        String name = "Poliana";
        System.out.println(name);
        int numero;
        numero = 15;
        System.out.println(numero);
        
        // Formas de contatenar 
        System.out.println("Hello " + name);

        String lastName = "Pinheiro";
        String fullName = name + " " + lastName;
        System.out.println("Hello " + fullName);

        System.out.println("Testanto o metodo concat(): " + name.concat(" " + lastName));

        // Declarando multiplas variaveis com valores diferentes
        int x = 2, y=3;
        System.out.println(x + y);

        //Declarando multiplas variavis com valores iguais
        int a,b,c;
        a= b= c = 5;
        System.out.println(a+ b + c); // vai somar e vai dar 15

        // float e double

        float num= 3.4f;
        double num_dois= 0.378d;
        System.out.println(num);
        System.out.println(num_dois);

        // entendendo casting
        int ii = 877;
        double dd = ii;
        System.out.println(dd); // ocorre automatico

        short ss = 98;
        byte bb = (byte) ss; // manual
        System.out.println(bb);


        String txt = "Poliana, conhecida por \"popo\". It\'s alright";
        System.out.println(txt);


        System.out.println("Testanto caractere de escape: " + name.concat(' ' + lastName));

    }
}

