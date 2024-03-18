/**Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir 
 * o custo mensal em energia elétrica com o equipamento inserido.*/

import java.util.Scanner;

public class Exercicio12 {
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

        double consumoMensalKWh = consumoDiarioKWh * 30; 
        double custoMensal = consumoMensalKWh * valorKWh;

        System.out.printf("Consumo mensal em kWh: %.2f kWh\n", consumoMensalKWh);
        System.out.printf("Custo mensal: R$ %.2f\n", custoMensal);


        input.close();
    }
    
}
