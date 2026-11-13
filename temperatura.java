
import java.util.Scanner;

public class temperatura{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] temperaturas = new double[10][3];

        // Cadastro das temperaturas
        for (int i = 0; i < 10; i++) {

            System.out.println("Dia " + (i + 1));

            System.out.print("Temperatura minima: ");
            temperaturas[i][0] = sc.nextDouble();

            System.out.print("Temperatura maxima: ");
            temperaturas[i][1] = sc.nextDouble();

            temperaturas[i][2] = (temperaturas[i][0] + temperaturas[i][1]) / 2;
        }

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Temperatura minima de todos os dias");
            System.out.println("2 - Temperatura maxima de todos os dias");
            System.out.println("3 - Maior variacao de temperatura");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    double menor = temperaturas[0][0];

                    for (int i = 0; i < 10; i++) {
                        if (temperaturas[i][0] < menor) {
                            menor = temperaturas[i][0];
                        }
                    }

                    System.out.println("Menor temperatura: " + menor);
                    break;

                case 2:
                    double maior = temperaturas[0][1];

                    for (int i = 0; i < 10; i++) {
                        if (temperaturas[i][1] > maior) {
                            maior = temperaturas[i][1];
                        }
                    }

                    System.out.println("Maior temperatura: " + maior);
                    break;

                case 3:
                    double variacao = temperaturas[0][1] - temperaturas[0][0];

                    for (int i = 0; i < 10; i++) {

                        double atual = temperaturas[i][1] - temperaturas[i][0];

                        if (atual > variacao) {
                            variacao = atual;
                        }
                    }

                    System.out.println("Maior variacao: " + variacao);
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }

        sc.close();
    }
}
