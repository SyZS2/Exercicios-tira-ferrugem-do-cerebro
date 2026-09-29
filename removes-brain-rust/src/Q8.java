import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] n = new int[10][12];
        int op = 0;
        while (op != 6) {
            System.out.println("1 - Reservar um assento");
            System.out.println("2 - Cancelar uma reserva");
            System.out.println("3 - Exibir o mapa dos assentos");
            System.out.println("4 - Mostrar assentos livres e ocupados");
            System.out.println("5 - Encontrar uma sequencia de assentos livres");
            System.out.println("6 - Encerrar");
            op = read.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe a fileira (1 a 10):");
                    int l = read.nextInt() - 1;
                    System.out.println("Informe o assento (1 a 12):");
                    int c = read.nextInt() - 1;
                    if (l < 0 || l > 9 || c < 0 || c > 11) {
                        System.out.println("Assento inexistente.");
                    } else if (n[l][c] == 1) {
                        System.out.println("Esse assento ja esta ocupado.");
                    } else {
                        n[l][c] = 1;
                        System.out.println("Assento reservado com sucesso.");
                    }
                    break;
                case 2:
                    System.out.println("Informe a fileira (1 a 10):");
                    l = read.nextInt() - 1;
                    System.out.println("Informe o assento (1 a 12):");
                    c = read.nextInt() - 1;
                    if (l < 0 || l > 9 || c < 0 || c > 11) {
                        System.out.println("Assento inexistente.");
                    } else if (n[l][c] == 0) {
                        System.out.println("Esse assento ja esta vago.");
                    } else {
                        n[l][c] = 0;
                        System.out.println("Reserva cancelada com sucesso.");
                    }
                    break;
                case 3:
                    System.out.println("\nMapa de Assentos");
                    for (l = 0; l < 10; l++) {
                        System.out.print("Fileira " + (l + 1) + ": ");
                        for (c = 0; c < 12; c++) {
                            System.out.print(n[l][c] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int li = 0;
                    int oc = 0;
                    for (l = 0; l < 10; l++) {
                        for (c = 0; c < 12; c++) {
                            if (n[l][c] == 0) {
                                li++;
                            } else {
                                oc++;
                            }
                        }
                    }
                    System.out.println("Assentos livres: " + li);
                    System.out.println("Assentos ocupados: " + oc);
                    break;
                case 5:
                    System.out.println("Informe a quantidade de pessoas:");
                    int p = read.nextInt();
                    int achou = 0;
                    for (l = 0; l < 10; l++) {
                        int cont = 0;
                        for (c = 0; c < 12; c++) {
                            if (n[l][c] == 0) {
                                cont++;
                            } else {
                                cont = 0;
                            }
                            if (cont == p && achou == 0) {
                                System.out.println("Sequencia confirmada");
                                System.out.println("Fileira: " + (l + 1));
                                System.out.print("Assentos: ");
                                for (int c2 = c - p + 1; c2 <= c; c2++) {
                                    System.out.print((c2 + 1) + " ");
                                }
                                System.out.println();
                                achou = 1;
                            }
                        }
                    }
                    if (achou == 0) {
                        System.out.println("Nao foi possivel encontrada uma sequencia de "+p+" assentos livres.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
    }
}