import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // altrando valor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);
            }
        }

        System.out.println("\nNovo vetor:");
        for (int num : vetor) {
            System.out.println(num + " ");
        }
    }
}
