package src;

public class Operadores03 {
  public static void main(String[] args) {

    String nome1 = "mateus";
    String nome2 = "mateus";


    System.out.println(nome1 == nome2);

    int n1 = 1;
    int n2 = 2;

    boolean simNao = n1 == n2;

    if (n1 < n2) {
      System.out.println("a nossa condicao é verdadeira");
    }

    System.out.println("N1 é igual a n2: " + simNao);


    simNao = n1 != n2;

    System.out.println("N1 é diferente ao n2: " + simNao);


    simNao = n1 > n2;

    System.out.println("N1 é maior que n2: " + simNao);
  }



}
