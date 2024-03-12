/**Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00). */

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[]args) {
    Scanner input = new Scanner(System.in);
    int hora;
    int min;
    int horaDia;
    int minDia;

    System.out.println("Qual o horario de agora?");
    hora = input.nextInt();

    System.out.println("Quantos minutos são agora?");
    min = input.nextInt();

    System.out.println("As horas agora são " + hora + ":" + min);

    horaDia = 60*hora;
    minDia = horaDia+min;

    System.out.println("Se passaram "+minDia+" minutos totais.");


    input.close();
}
}