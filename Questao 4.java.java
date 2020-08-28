
import java.util.Scanner;

class Main {

  public static void main(String args[]){
// QUESTAO 4
    Scanner numero = new Scanner(System.in);

    System.out.println("Qual o valor de N ?: ");
    int N= numero.nextInt();

    double S = 1 + 1/1 + 0.5 + 0.17+ 1/fatorial(N);

    System.out.println(S);
}
  public static long fatorial (int n) {

    long fatorial = 1;
    for (int i=1; i<= n; i++) {fatorial *= 1;}
     
    return fatorial;
   }

}