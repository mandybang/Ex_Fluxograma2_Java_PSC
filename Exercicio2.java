/**Uma dúvida que sempre paira na cabeça dos motoristas é: 
 * Abastecer com etanol ou gasolina? 
 * Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, 
 * quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento 
 * do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis,
 *  e informe qual deve ser a escolha, com base no custo.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double etanol;
        double gasolina;
        double consumoEt;

        System.out.println("Qual o valor do etanol?");
        etanol = input.nextDouble();

        System.out.println("Qual o valor da gasolina? ");
        gasolina =  input.nextDouble();

    consumoEt = (etanol/gasolina) * 100; //porcentagem em relação ao outro
        System.out.println("A porcentagem de diferença entre o etanol e gasolina é de: " + consumoEt);


    input.close();
    }
}
