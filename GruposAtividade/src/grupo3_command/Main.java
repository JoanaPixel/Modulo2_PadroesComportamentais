package grupo3_command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilaImpressao fila = new FilaImpressao();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU IMPRESSORA ===");
            System.out.println("1 - Imprimir documento");
            System.out.println("2 - Desfazer última impressão");
            System.out.println("3 - Listar histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do documento: ");
                    String nome = scanner.nextLine();
                    Documento doc = new Documento(nome);
                    ComandoImprimir comando = new ComandoImprimir(doc);
                    fila.adicionarComando(comando);
                }
                case 2 -> fila.desfazerUltimo();
                case 3 -> fila.listarHistorico();
                case 0 -> System.out.println("Encerrando impressora...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
