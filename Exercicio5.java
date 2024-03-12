/**Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. 
 * O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora*/

import java.util.Scanner;
public class Exercicio5 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da altura do retangulo: ");
        double alturaH = input.nextDouble();

        System.out.println("Digite o valor da base do retangulo: ");
        double baseB = input.nextDouble();

        double area= baseB * alturaH;
        System.out.println("O valor da area do retangulo é: " + area);

        double perimetro = 2 * (baseB + alturaH);
        System.out.println("O valor do perimetro do retangulo é: " + perimetro);

        double raiz = (alturaH*alturaH) + (baseB*baseB);
        
        double diagonal = Math.sqrt (raiz);
        System.out.println("O valor da diagonal do retangulo é: " + diagonal);

       
       input.close();
    }
}
