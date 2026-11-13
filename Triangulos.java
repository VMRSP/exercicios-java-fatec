
import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] triangulos = new double[10][3];

        int isoceles = 0;
        int equilateros = 0;
        int escalenos = 0;
        int invalidos = 0;

        // Cadastro dos triangulos
        for (int i = 0; i < 10; i++) {

            System.out.println("\nTriangulo " + (i + 1));

            for (int j = 0; j < 3; j++) {

                System.out.print("Digite o tamanho da aresta " + (j + 1) + ": ");
                triangulos[i][j] = sc.nextDouble();
            }
        }

        // Classificacao dos triangulos
        for (int i = 0; i < 10; i++) {

            double a = triangulos[i][0];
            double b = triangulos[i][1];
            double c = triangulos[i][2];

            if (a <= 0 || b <= 0 || c <= 0 ||
                a + b <= c || a + c <= b || b + c <= a) {

                invalidos++;

            } else if (a == b && b == c) {

                equilateros++;

            } else if (a == b || a == c || b == c) {

                isoceles++;

            } else {

                escalenos++;
            }
        }

        // Calculo dos percentuais
        System.out.println("\n RESULTADO ");

        System.out.println("Isoceles: " + (isoceles * 10) + "%");

        System.out.println("Equilateros: " + (equilateros * 10) + "%");

        System.out.println("Escalenos: " + (escalenos * 10) + "%");

        System.out.println("Invalidos: " + (invalidos * 10) + "%");

        sc.close();
    }
}
