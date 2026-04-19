import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        char[] letras = nome.toCharArray();

        int inicio = 0;
        int fim = letras.length - 1;

        while (inicio < fim) {
            char temp = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println("Nome invertido: ");
        System.out.println(new String(letras));
    }
}
