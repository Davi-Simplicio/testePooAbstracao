public abstract class OrdemDeServico implements Imprimivel{
    private int numeroOrdem;
    private String descricao;
    private String status;

    public OrdemDeServico(int numeroOrdem, String descricao, String status) {
        this.numeroOrdem = numeroOrdem;
        this.descricao = descricao;
        this.status = status;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public String mostrarDados() {
        return this.toString();
    }

    public void atualizarStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "numeroOrdem=" + numeroOrdem +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
