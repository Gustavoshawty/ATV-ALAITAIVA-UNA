import java.util.Scanner;

public class AplicativoHidratacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o peso do funcionário em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a quantidade de água já ingerida (em litros): ");
        double aguaIngerida = scanner.nextDouble();

        // Cálculo da quantidade ideal de água a ingerir por dia em litros
        double quantidadeIdeal = Math.ceil((peso * 35) / 1000.0);

        // Cálculo da quantidade a ingerir no dia
        double quantidadeIngerir = quantidadeIdeal - aguaIngerida;

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Quantidade de água ingerida: " + aguaIngerida + " litros");
        System.out.println("Quantidade ideal de água a ingerir: " + quantidadeIdeal + " litros");

        // Verificação e exibição da mensagem com base na quantidade a ingerir
        if (quantidadeIngerir <= 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
        } else {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + quantidadeIngerir + " litros! Você consegue!");
        }

        scanner.close();
    }
}