import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o número do jogo:");
        int numero = leitor.nextInt();

        jogo(numero, leitor);
        leitor.close();

    }
    public static void jogo(int numero, Scanner leitor){
        int chute;
        do{
            System.out.println("Digite seu chute:");
            chute = leitor.nextInt();

            if (chute < numero) {
                System.out.println("Seu chute é menor que o número");
               } else if (chute>numero){
                    System.out.println("Seu chute é maior que o número");
                }
            else{
                System.out.println("Você acertou!");
            }

        } while (chute != numero);

    }
}
