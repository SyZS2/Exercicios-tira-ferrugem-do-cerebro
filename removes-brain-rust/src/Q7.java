import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] n = new int[8][8];
        int[][] d = new int[8][8];
        int ac = 0;
        int er = 0;
        int rep = 0;
        for (int i = 0; i < 5; i++) {
            int p = 0;
            while (p == 0) {
                System.out.println("Informe a linha do navio " + (i + 1) + " (1 a 8):");
                int l = read.nextInt() - 1;
                System.out.println("Informe a coluna do navio " + (i + 1) + " (1 a 8):");
                int c = read.nextInt() - 1;
                if (l < 0 || l > 7 || c < 0 || c > 7) {
                    System.out.println("Posicao fora do tabuleiro.");
                } else if (n[l][c] == 1) {
                    System.out.println("Ja existe um navio nessa posicao.");
                } else {
                    n[l][c] = 1;
                    p = 1;
                }
            }
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("\nDisparo " + (i + 1));
            System.out.println("Informe a linha (1 a 8):");
            int l = read.nextInt() - 1;
            System.out.println("Informe a coluna (1 a 8):");
            int c = read.nextInt() - 1;
            if (l < 0 || l > 7 || c < 0 || c > 7) {
                System.out.println("Disparo fora do tabuleiro.");
                er++;
            } else if (d[l][c] == 1) {
                System.out.println("Disparo repetido.");
                rep++;
            } else if (n[l][c] == 1) {
                System.out.println("Acerto.");
                d[l][c] = 1;
                ac++;
                if (ac == 5) {
                    System.out.println("Todos os navios foram destruidos.");
                }
            } else {
                System.out.println("Erro.");
                d[l][c] = 1;
                er++;
            }
        }
        System.out.println("\nAcertos: " + ac);
        System.out.println("Erros: " + er);
        System.out.println("Disparos repetidos: " + rep);
    }
}