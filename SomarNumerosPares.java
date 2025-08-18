/* Escreva um programa que receba um número inteiro positivo N e
*  retorne a soma de todos os números pares de 1 até N.
*  Se N for menor que 2, retorne 0.
*/
import java.util.Scanner;

public class SomarNumerosPares {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();

        int soma = 0;
        for (int i = 2; i <= number; i+=2) {
            soma += i;
        }

        System.out.println("A soma de todos os números pares até o número informado é de: " + soma);

        scanner.close();
    }
}