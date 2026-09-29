import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] n = new int[3][3];
        int r = 0;
        int nu = 1;
        int li = 1;
        int co = 1;
        int d = 1;
        int dp = 0;
        int ds = 0;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Informe o valor da linha "+(l+1)+" e coluna "+(c+1));
                n[l][c] = read.nextInt();
            }
        }
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (n[l][c] < 1 || n[l][c] > 9) {
                    nu = 0;
                }
                for (int l2 = 0; l2 < 3; l2++) {
                    for (int c2 = 0; c2 < 3; c2++) {
                        if (l != l2 || c != c2) {
                            if (n[l][c] == n[l2][c2]) {
                                nu = 0;
                            }
                        }
                    }
                }
            }
        }
        for (int c = 0; c < 3; c++) {
            r += n[0][c];
        }
        for (int l = 0; l < 3; l++) {
            int sl = 0;
            for (int c = 0; c < 3; c++) {
                sl += n[l][c];
            }
            if (sl != r) {
                li = 0;
            }
        }
        for (int c = 0; c < 3; c++) {
            int sc = 0;
            for (int l = 0; l < 3; l++) {
                sc += n[l][c];
            }
            if (sc != r) {
                co = 0;
            }
        }
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (l == c) {
                    dp += n[l][c];
                }
                int h = l + c;
                if (h == 2) {
                    ds += n[l][c];
                }
            }
        }
        if (dp != r) {
            d = 0;
        }
        if (ds != r) {
            d = 0;
        }
        if (nu == 1 && li == 1 && co == 1 && d == 1) {
            System.out.println("E um quadrado magico.");
        } else {
            System.out.println("Nao e um quadrado magico.");
            if (nu == 0) {
                System.out.println("A matriz nao possui os numeros de 1 a 9 sem repeticao.");
            }
            if (li == 0) {
                System.out.println("As linhas nao possuem a mesma soma.");
            }
            if (co == 0) {
                System.out.println("As colunas nao possuem a mesma soma.");
            }
            if (d == 0) {
                System.out.println("As diagonais nao possuem a mesma soma.");
            }
        }
    }
}
