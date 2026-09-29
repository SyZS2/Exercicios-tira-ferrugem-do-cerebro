import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double [] n = new double[10];
        double med, mai, men, soma = 0;
        int quantMa = 0, quantMe = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira a nota do aluno "+ i);
            n[i] = read.nextDouble();
            soma += n[i];
        }
        mai = n[0];
        men = n[0];
        med = soma/10;
        for (int i = 0; i < 10; i++) {
            if (mai < n[i]) {
                mai = n[i];
            }
            if (men > n[i]) {
                men = n[i];
            }
            if (n[i] >= 7) {
                quantMa++;
            }
            if (n[i] < med) {
                quantMe++;
            }
        }
        System.out.println("A media dessa turma e: "+med);
        System.out.println("A maior nota dessa turma e: "+mai);
        System.out.println("A menor nota dessa turma e: "+men);
        System.out.println("A quantidade de alunos com notas maior ou igual a 7 e: "+quantMa);
        System.out.println("A quantidade de alunos com notas abaixo da media e: "+quantMe);
    }
}