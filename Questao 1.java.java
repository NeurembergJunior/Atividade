import java.util.Scanner;

class Main{
 //QUESTAO 1 
    public static void main(String[] args) {

    Scanner entrada= new Scanner(System.in);

    System.out.print("Qual o valor pago: ");
    String pago1 = entrada.nextLine();
    double conversao1 = Double.valueOf(pago1);

    System.out.print("Quanto custou ? ");
    String pago2 = entrada.nextLine();
    double conversao2 = Double.valueOf(pago2);

    double troco = conversao2 - conversao1;
    System.out.print("Seu troco é: "+troco);

  }
  }
