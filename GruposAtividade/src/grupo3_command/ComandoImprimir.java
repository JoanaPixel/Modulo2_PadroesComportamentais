package grupo3_command;

class ComandoImprimir implements Comando {
    private Documento documento;

    public ComandoImprimir(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void executar() {
        documento.imprimir();
    }

    @Override
    public void desfazer() {
        documento.cancelar();
    }

    public String getNomeDocumento() {
        return documento.getNome();
    }
}
