public class OrdemManutencao extends OrdemDeServico{
    private String equipamento;
    private String dataManutencao;

    public OrdemManutencao(int numeroOrdem, String descricao, String status, String equipamento, String dataManutencao) {
        super(numeroOrdem, descricao, status);
        this.equipamento = equipamento;
        this.dataManutencao = dataManutencao;
    }


    @Override
    public String toString() {
        return "OrdemManutencao{" +
                "equipamento='" + equipamento + '\'' +
                ", dataManutencao='" + dataManutencao + '\'' +
                "} " + super.toString();
    }
}
