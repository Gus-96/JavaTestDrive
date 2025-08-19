// Imprimi a sequência de Fibonacci até um limite
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci até " + n + ": ");

        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        scanner.close();
    }
}