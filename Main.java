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

        // Declarando multiplas variaveis com valores diferentes
        int x = 2, y=3;
        System.out.println(x + y);

        //Declarando multiplas variavis com valores iguais
        int a,b,c;
        a= b= c = 5;
        System.out.println(a+ b + c); // vai somar e vai dar 15

    }
}

