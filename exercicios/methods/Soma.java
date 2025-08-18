package exercicios.methods;

public class Soma {
  static int soma(int number) {

    /* se number maior que zero; some number com number - 1, até 'zerar' */
    if (number > 0) {
      return number + soma(number - 1);
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int resulto = soma(2);
    System.out.println(resulto);
  }
  
}
