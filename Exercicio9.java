/** Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, 
 * em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: 
 * https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. 
 * Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo. */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double imcIdeal = 22;

        System.out.println("Informe o seu peso atual em kg: ");
        double peso = input.nextDouble();

        System.out.println("Informe sua altura em centímetros: ");
        double altura = input.nextDouble() / 100; //converter cm em metros

        double imc = peso / (altura * altura);
        double pesoIdeal = imcIdeal * (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.printf("Seu peso ideal é aproximadamente: %.2f kg\n", pesoIdeal);

        input.close();
    }
}
