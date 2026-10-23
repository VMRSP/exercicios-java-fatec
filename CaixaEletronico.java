import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double saldo = 1000.00;
        double valor;
        int opcao;
        String continuar;

        do {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");

            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Seu saldo é: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: R$ ");
                    valor = leitor.nextDouble();

                    if (valor > 0 && valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.println("Saque realizado!");
                        System.out.println("Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Valor inválido ou saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: R$ ");
                    valor = leitor.nextDouble();

                    if (valor > 0) {
                        saldo = saldo + valor;
                        System.out.println("Depósito realizado!");
                        System.out.println("Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = leitor.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Caixa eletrônico encerrado.");

        leitor.close();
    }
}