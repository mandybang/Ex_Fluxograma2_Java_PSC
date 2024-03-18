/**Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =(raiz quadrada) a2+b2 
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[]args) {
    Scanner input = new Scanner(System.in);
    double c;
    double a;
    double b;
    double raiz;

    System.out.println("Digite o primeiro número: ");
    a = input.nextDouble();
    
    System.out.println("Digite o segundo número: ");
    b = input.nextDouble();

    raiz = (a*a) + (b*b);
    
    c = Math.sqrt (raiz);
    double raizResul = c;

    System.out.println("A expressão c =(raiz quadrada) a2+b2 deu o resultado arredondado de: " + raizResul );
   
    input.close();
}
}
