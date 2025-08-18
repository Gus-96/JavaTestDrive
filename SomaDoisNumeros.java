// Soma de dois números
import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double number1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double number2 = scanner.nextDouble();

        double soma = number1 + number2;
        System.out.println("A soma dos dois números é: " + soma);

        scanner.close();
    }
}
