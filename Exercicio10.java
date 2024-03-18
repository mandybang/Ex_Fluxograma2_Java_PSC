/**A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.
*/


import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe seu peso em kg: ");
        double peso = input.nextDouble();

        double qtdAgua = peso * 35 / 1000; // converter para litros

        System.out.printf("Você deve ingerir aproximadamente: %.2f litros de água por dia \n" , qtdAgua);


        input.close();
    }
    
}
