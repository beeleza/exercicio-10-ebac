import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número: " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // bubble sort
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor ordenado");
        for (int num : vetor) {
            System.out.println(num + " ");
        }

        sc.nextLine();

        System.out.println("\nDigite um nome: ");
        String nome = sc.nextLine().toLowerCase();

        int vogais = 0;

        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
    }
}
