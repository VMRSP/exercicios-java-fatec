import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero < 0 || numero > 20) {
            System.out.println("Digite um número entre 0 e 20.");
        } else {
            long resultado = fatorial(numero);

            System.out.println("O fatorial de " + numero
                    + " é " + resultado);
        }

        leitor.close();
    }

    public static long fatorial(int numero) {

        long resultado = 1;
        int contador = 1;

        while (contador <= numero) {
            resultado = resultado * contador;
            contador++;
        }

        return resultado;
    }
}