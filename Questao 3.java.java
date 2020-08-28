
import java.util.Scanner;

class Main {


  public static void main(String[] args) {
//QUESTAO 3
    Scanner entrada = new Scanner(System.in);

    System.out.print("Qual o peso do peixe ?");

    int pesopeixe = entrada.nextInt();

    if (pesopeixe > 50){
    System.out.print("Infelizmente recebera uma multa de :R$ "+ (pesopeixe - 50)*4);
    }
    else{

    System.out.print("Você não pagara multa!");
    }




  }
}