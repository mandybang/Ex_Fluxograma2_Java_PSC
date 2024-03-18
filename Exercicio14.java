/**Escreva um algoritmo que recebe dois pontos no plano cartesiano, 
 * P1=(x1,y1) e P2=(x2,y2) e calcula a distância entre eles, dada por d(P1,P2)=(raiz)(x1-x2)²+(y1-y2)² */

 import java.util.Scanner;
 
 public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double  x1;
        double  y1;
        double  x2;
        double  y2;
        double distancia;

        System.out.println("Insira as coordenadas do ponto P1 (x1, y1):");
        x1 = input.nextDouble();
        y1 = input.nextDouble();


        System.out.println("Insira as coordenadas do ponto P2 (x2, y2):");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow (y1 - y2, 2));

        System.out.println("A distância entre os pontos P1 e P2 é: " + distancia);



        input.close();
    }
    
}
