/**Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. 
 * As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. 
 * O resultado também deverá ser exibido em formato de fração. e.g: ⅗ */

    import java.util.Scanner;

    public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o numerador e o denominador da primeira fração:");
        int numerador1 = input.nextInt();
        int denominador1 = input.nextInt();

        System.out.println("Insira o numerador e o denominador da segunda fração:");
        int numerador2 = input.nextInt();
        int denominador2 = input.nextInt();

        int novoDenominador = denominador1 * denominador2;
        int novoNumerador = numerador1 * denominador2 + numerador2 * denominador1;

        System.out.println("A soma das frações é: " + novoNumerador + "/" + novoDenominador);

        input.close();
    }
}
