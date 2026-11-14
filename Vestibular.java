
import java.util.Scanner;

public class Vestibular {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] inscritos = new String[10][3];

        int quantidade = 0;

        int ads = 0;
        int gecom = 0;
        int eventos = 0;
        int rh = 0;

        int somaIdades = 0;

        while (quantidade < 10) {

            System.out.println("\nDigite o CPF:");
            String cpf = scan.nextLine();

            boolean cadastrado = false;

            for (int i = 0; i < quantidade; i++) {

                if (inscritos[i][0].equals(cpf)) {
                    cadastrado = true;
                    break;
                }
            }

            if (cadastrado) {

                System.out.println("CPF ja cadastrado. Registro nao inserido.");

            } else {

                System.out.println("Digite a idade:");
                String idade = scan.nextLine();

                System.out.println("Escolha o curso:");
                System.out.println("1 - ADS");
                System.out.println("2 - GECOM");
                System.out.println("3 - Eventos");
                System.out.println("4 - RH");

                String curso = scan.nextLine();

                inscritos[quantidade][0] = cpf;
                inscritos[quantidade][1] = idade;
                inscritos[quantidade][2] = curso;

                quantidade++;

                System.out.println("Inscrito cadastrado com sucesso!");
            }
        }
        for (int i = 0; i < quantidade; i++) {

            int idade = Integer.parseInt(inscritos[i][1]);
            int curso = Integer.parseInt(inscritos[i][2]);

            somaIdades += idade;

            switch (curso) {
                case 1:
                    ads++;
                    break;

                case 2:
                    gecom++;
                    break;

                case 3:
                    eventos++;
                    break;

                case 4:
                    rh++;
                    break;
            }
        }
        System.out.println("\n--- RESULTADO FINAL ---");

        System.out.println("Inscritos em ADS: " + ads);
        System.out.println("Inscritos em GECOM: " + gecom);
        System.out.println("Inscritos em Eventos: " + eventos);
        System.out.println("Inscritos em RH: " + rh);

        if (quantidade > 0) {
            double media = (double) somaIdades / quantidade;
            System.out.println("Media de idade: " + media);
        }

        scan.close();
    }
}
