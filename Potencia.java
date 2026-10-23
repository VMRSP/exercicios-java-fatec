import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = leitor.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = leitor.nextInt();

        if (expoente < 0) {
            System.out.println("O expoente deve ser maior ou igual a zero.");
        } else {
            int resultado = potencia(base, expoente);

            System.out.println(base + " elevado a "
                    + expoente + " = " + resultado);
        }

        leitor.close();
    }

    public static int potencia(int base, int expoente) {

        int resultado = 1;
        int contador = 0;

        while (contador < expoente) {
            resultado = resultado * base;
            contador++;
        }

        return resultado;
    }
}