/** Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. 
 * Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos. */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
          System.out.print("Informe o tamanho do arquivo em MB: ");
          double tamanhoArquivoMB = input.nextDouble();
        
          System.out.print("Informe a velocidade do link em Mbps: ");
          double velocidadeLinkMbps = input.nextDouble();

          double tempoEmSegundos = (tamanhoArquivoMB * 8) / velocidadeLinkMbps;
          double tempoEmMinutos = tempoEmSegundos / 60;

          System.out.println("Tempo necessário para o download é de :" + tempoEmMinutos + " minutos");

    
        input.close();
    }
}
