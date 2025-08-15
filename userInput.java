import java.util.Scanner;

class UserInput{
    public static void main(String[] args){
        Scanner nome = new Scanner(System.in);  //crie um objeto scanner
        System.out.println("Digite o nome: ");
        String userName = nome.nextLine();  // para ler o objeto
        System.out.println("Seu nome de usuário é: " + userName);  
       

        Scanner idade = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int userAge = idade.nextInt();
        System.out.println("Você tem " + userAge + " anos");

        if (userAge<=18){
            System.out.println("Você é maior de idade");
        }
        else if (userAge>=18 && userAge<=29){
            System.out.println("Você tem direito a carteira de estudante");
        }
        else{
            System.out.println("Você não é maior de idade");
        }

        String age = (userAge>29) ? "Você é maior que 29 anos" : "Você deve procurar um estágio";
        System.out.println(age);

        idade.close();
        nome.close();


    }
}