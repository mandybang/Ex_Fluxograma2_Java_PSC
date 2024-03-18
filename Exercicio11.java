/**Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. 
 * Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, 
 * e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. 
 * Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.
*/

import java.util.Scanner;

    public class Exercicio11 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Informe a potência do equipamento em Watts: ");
        double potencia = input.nextDouble();
        
        System.out.print("Informe a quantidade de horas que fica ligado por dia: ");
        double horasPorDia = input.nextDouble();
        
        System.out.print("Informe o valor do kWh em reais: ");
        double valorKWh = input.nextDouble();
        
        double consumoDiarioKWh = (potencia * horasPorDia) / 1000;
        double custoDiario = consumoDiarioKWh * valorKWh;

        System.out.printf("Consumo diário em kWh: %.2f kWh\n", consumoDiarioKWh);
        System.out.printf("Custo diário: R$ %.2f\n", custoDiario);


            input.close();
        
    }
    
}
