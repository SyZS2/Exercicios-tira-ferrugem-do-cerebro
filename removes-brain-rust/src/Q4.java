import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [][] m = new int[5][5];
        int [][] mr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite um numero para "+(i+1)+" "+(j+1)+": ");
                m[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mr[j][4-i] = m[i][j];
            }
        }
        System.out.println("Matriz Original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matriz Rotacionada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
