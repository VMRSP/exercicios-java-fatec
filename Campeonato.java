import java.util.Scanner;

public class Campeonato {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] tabela = new int[10][4];
        String[] times = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Nome do " + (i + 1) + "o time:");
            times[i] = scan.nextLine();

            System.out.println("Quantidade de vitorias:");
            tabela[i][0] = Integer.parseInt(scan.nextLine());

            System.out.println("Quantidade de empates:");
            tabela[i][1] = Integer.parseInt(scan.nextLine());

            System.out.println("Quantidade de derrotas:");
            tabela[i][2] = Integer.parseInt(scan.nextLine());

            
            tabela[i][3] = tabela[i][0] * 3 + tabela[i][1];
        }

       
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9 - i; j++) {

                if (tabela[j][3] < tabela[j + 1][3]) {

                    
                    String auxNome = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = auxNome;

                    
                    for (int k = 0; k < 4; k++) {

                        int aux = tabela[j][k];
                        tabela[j][k] = tabela[j + 1][k];
                        tabela[j + 1][k] = aux;
                    }
                }
            }
        }

        
        System.out.println("Classificação final do campeonato:");

        for (int i = 0; i < 3; i++) {

            System.out.println(
                (i + 1) + "o lugar: " + times[i] +
                " - " + tabela[i][3] + " pontos"
            );
        }

        scan.close();
    }
}
