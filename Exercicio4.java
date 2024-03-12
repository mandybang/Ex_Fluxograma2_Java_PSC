/**Crie um programa para calcular a regra de três. */

 import java.util.Scanner;
 
 public class Exercicio4 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x;
       double um;

        System.out.println("Digite o primeiro número: ");
        a = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        b = input.nextDouble();

        System.out.println("Digite o terceiro número: ");
        c = input.nextDouble();

        um = (c*b);
        x = um/a;

        System.out.println("O calculo de regra de três deu: " + x);

        input.close();
}
 }