import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada:");
        int numero = leitor.nextInt();

        tabuada(numero);

        leitor.close();
    }

    public static void tabuada(int numero) {

        int contador = 1;

        do {
            int resultado = numero * contador;

            System.out.println(numero + " x " + contador + " é igual a " + resultado);

            contador++;

        } while (contador <= 10);

        System.out.println("Fim da tabuada.");
    }
}