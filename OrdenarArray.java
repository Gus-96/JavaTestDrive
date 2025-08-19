import java.util.Scanner;
import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do Array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.print("Digite os elementos do Array: ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));

        scanner.close();
    }
}
