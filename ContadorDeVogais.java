// Conta quantas vogais tem em uma palavra ou frase.
import java.util.Scanner;

public class ContadorDeVogais {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome ou uma frase: ");
        String nome = scanner.nextLine();

        nome = nome.toLowerCase();
        int vogais = 0;

        for (int i = 0; i < nome.length(); i++){
            char c = nome.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }
        System.out.println("Total de vogais: " + vogais);

        scanner.close();
    }
}