//**Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
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
         
     
        System.out.println("Qual o valor do metro quadrado da ceramica escolhida?");
        double valorCer = input.nextDouble();

        double valorTotalCer = valorCer * quantRev;
        System.out.println("O valor total a ser pago pela ceramica é de: " +valorTotalCer +" reais.");




        input.close();
    }
}
