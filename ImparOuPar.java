// Verifica se o número é Impar ou Par
import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Número par!");
        } else {
            System.out.println("Número impar!");
        }

        scanner.close();
    }
}
