import java.util.Scanner;


class Main {

  public static void main(String[] args) {
    //QUESTAO 2
    Scanner entrada = new Scanner(System.in);

    System.out.print("Qual o valor de a ? ");
    String aa = entrada.nextLine();
    double a = Double.valueOf(aa);

    System.out.print("Qual o valor de b ? ");
    String bb = entrada.nextLine();
    double b = Double.valueOf(bb);

    System.out.print("Qual o valor de c ? ");
    String cc = entrada.nextLine();
    double c = Double.valueOf(cc);

    double delta = (b*b) - (4*a*c);

    double x1 = (-b + Math.sqrt(Math.abs(delta)))/ 2*a;
    double x2 = (-b - Math.sqrt(Math.abs(delta)))/ 2*a;

    System.out.println("x'= "+ x1);

    System.out.println("x''= "+ x2);





  }
}