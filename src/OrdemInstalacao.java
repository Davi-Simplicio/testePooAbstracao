public class OrdemInstalacao extends OrdemDeServico{
    private Usuario cliente;
    private String dataInstalacao;

    public OrdemInstalacao(int numeroOrdem, String descricao, String status, Usuario cliente, String dataInstalacao) {
        super(numeroOrdem, descricao, status);
        this.cliente = cliente;
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public String toString() {
        return "OrdemInstalacao{" +
                "cliente=" + cliente +
                ", dataInstalacao='" + dataInstalacao + '\'' +
                "} " + super.toString();
    }
}
