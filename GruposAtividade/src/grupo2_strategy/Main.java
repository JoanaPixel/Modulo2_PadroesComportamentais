package grupo2_strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu plano de assinatura:");
        System.out.println("1 - Básico");
        System.out.println("2 - Padrão");
        System.out.println("3 - Premium");
        System.out.print("Digite o número do plano desejado: ");
        int opcao = scanner.nextInt();

        PlanoStrategy planoSelecionado;

        switch (opcao) {
            case 1 -> planoSelecionado = new PlanoBasico();
            case 2 -> planoSelecionado = new PlanoPadrao();
            case 3 -> planoSelecionado = new PlanoPremium();
            default -> {
                System.out.println("Opção inválida. Plano padrão selecionado por padrão.");
                planoSelecionado = new PlanoPadrao();
            }
        }

        Assinatura assinatura = new Assinatura(planoSelecionado);
        assinatura.mostrarPreco();
    }
}
