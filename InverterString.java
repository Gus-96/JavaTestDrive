// Peça uma palavra ao usuário e imprima-a invertida

import java.util.Scanner;

public class InverterString {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.print("Palavra invertida: " + invertida);

        scanner.close();
    }
}
