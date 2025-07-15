package grupo3_command;

import java.util.*;

class FilaImpressao {
    private Stack<ComandoImprimir> historico = new Stack<>();

    public void adicionarComando(ComandoImprimir comando) {
        comando.executar();
        historico.push(comando);
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) {
            ComandoImprimir ultimo = historico.pop();
            ultimo.desfazer();
        } else {
            System.out.println("⚠️ Nenhuma impressão para desfazer.");
        }
    }

    public void listarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("📝 Nenhum documento impresso ainda.");
            return;
        }

        System.out.println("📚 Histórico de Impressões:");
        for (ComandoImprimir c : historico) {
            System.out.println("- " + c.getNomeDocumento());
        }
    }
}
