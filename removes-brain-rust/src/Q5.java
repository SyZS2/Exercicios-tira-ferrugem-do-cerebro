import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [] v = new int[20];
        int [] vo = new int[20];
        int c = 0, t = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um valor para "+(i+1)+":");
            v[i] = read.nextInt();
            vo[i] = v[i];
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                c++;
                if (v[j] > v[j+1]) {
                    int ph = v[j];
                    v[j] = v[j+1];
                    v[j+1] = ph;
                    t++;
                }
            }
        }
        System.out.println("Vetor Original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vo[i]+"\t");
        }
        System.out.println("\nVetor Organizado:");
        for (int j = 0; j < 20; j++) {
            System.out.print(v[j]+"\t");
        }
        double m = (vo[9] = vo[10])/2.0;
        System.out.println("\nQuantia de trocas: "+t);
        System.out.println("Quantia de comparacoes: "+c);
        System.out.println("Mediana desse vetor: "+m);
    }
}
