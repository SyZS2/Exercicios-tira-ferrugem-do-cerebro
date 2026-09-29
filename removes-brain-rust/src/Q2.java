import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [][] n = new int[4][4];
        int somadiaprin = 0, somadiasecu = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Insira uma valor inteiro para "+i+" "+j);
                n[i][j] = read.nextInt();
            }
        }
        System.out.println("Diagonal Principal");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j) {
                    System.out.println(n[i][j]);
                    somadiaprin += n[i][j];
                }
            }
        }
        System.out.println("Diagonal Secundaria");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i+j == 3) {
                    System.out.println(n[i][j]);
                    somadiasecu += n[i][j];
                }
            }
        }
        System.out.println("A soma dos valores da diagonal principal e: "+somadiaprin);
        System.out.println("A soma dos valores da diagonal secundaria e: "+somadiasecu);
        if (somadiaprin > somadiasecu) {
            System.out.println("A soma da diagonal principal e maior que a soma da diagonal secundaria");
        }
        else if (somadiasecu > somadiaprin) {
            System.out.println("A soma da diagonal secundaria e maior que a soma da diagonal primaria");
        }
        else if (somadiaprin == somadiasecu){
            System.out.println("A soma da diagonal principal e igual a soma da diagonal secundaria");
        }
    }

}
