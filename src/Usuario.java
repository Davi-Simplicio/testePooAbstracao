import java.util.ArrayList;

public abstract class Usuario implements CriadorOrdem,VisualizadorOrdem,EditorOrdem{
    static ArrayList<Usuario>usuarios = new ArrayList<>();
    private float cpf;
    private String nome;
    private ArrayList<OrdemDeServico> ordensDeServico = new ArrayList<>();

    public Usuario(float cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        usuarios.add(this);
    }

    public ArrayList<OrdemDeServico> getOrdensDeServico() {
        return ordensDeServico;
    }

    public String criarOrdem(OrdemDeServico ordem) {
        this.ordensDeServico.add(ordem);
        Main.gerenciadorOrdens.criarOrdem(ordem);
        return "Ordem Criada";
    }

    public String verOrdens() {
        String mostrarOrdens="";
        for (OrdemDeServico ordemE:Main.gerenciadorOrdens.getOrdensDeServiçoGerenciador()) {
            mostrarOrdens += "Numero da ordem["+ordemE.getNumeroOrdem()+"] "+ordemE.mostrarDados()+"\n";
        }
        return mostrarOrdens;
    }

    public String editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        Main.gerenciadorOrdens.getOrdensDeServiçoGerenciador().set(numeroOrdem,ordem);
        for (Usuario usuarioE:usuarios) {
            if (usuarioE instanceof Solicitante){
                for (OrdemDeServico ordemDeServicoE: usuarioE.ordensDeServico) {
                    if (ordemDeServicoE.getNumeroOrdem() == numeroOrdem){
                        usuarioE.ordensDeServico.set(usuarioE.ordensDeServico.indexOf(ordemDeServicoE),ordem);
                    }
                }
            }
        }
        return "Ordem Editada";
    }

    @Override
    public String toString() {
        return "cpf=" + cpf +
                ", nome='" + nome + '\'';
    }
}
