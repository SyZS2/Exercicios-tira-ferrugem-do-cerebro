import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] n = new int[15];
        int[] v = new int[15];
        int qtd = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Insira os valores para o vetor: ");
            n[i] = read.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            int r = 0;
            for (int j = 0; j < qtd; j++) {
                if (n[i] == v[j]) {
                    r = 1;
                }
            }
            if (r == 0) {
                v[qtd] = n[i];
                qtd++;
            }
        }
        for (int i = 0; i < qtd; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\nQuantidade de valores distintos: " + qtd);
    }
}