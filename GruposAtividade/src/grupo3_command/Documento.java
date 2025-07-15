package grupo3_command;

class Documento {
    private String nome;

    public Documento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir() {
        System.out.println("🖨️ Imprimindo documento: " + nome);
    }

    public void cancelar() {
        System.out.println("❌ Impressão cancelada: " + nome);
    }
}
