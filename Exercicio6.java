/**Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. 
 * A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. 
 * Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.*/

import java.util.Scanner;
public class Exercicio6 {
    public static void main (String[]args) {
       Scanner input = new Scanner(System.in);
       double largura;
       double comprimento;
       double area;
       String ceramica;
       double dezPorc;
       int quantRev;

        System.out.println("Qual é a largura da area que será revestida?");
        largura = input.nextDouble();

        System.out.println("Qual é o comprimento da area que será revestida?");
        comprimento = input.nextDouble();

        area = largura*comprimento;

        System.out.println("Qual a ceramica será usada?");
        ceramica = input.next();

        dezPorc =area * 1.10; //10% = 1.10
        quantRev =(int) Math.ceil(dezPorc);

        System.out.println("A quantidade de area revestida com mais 10% será: " + quantRev + " metros. E a ceramica utilizada será: " + ceramica);
        
    
       input.close();
    }
}
