import java.util.ArrayList;

public class Administrador extends Usuario implements RemovedorOrdem{

    public Administrador(float cpf, String nome) {
        super(cpf, nome);
    }


    @Override
    public String deletarOrdem(int numeroOrdem) {
        if (Main.gerenciadorOrdens.procurarOrdem(numeroOrdem)!=null){
            Main.gerenciadorOrdens.deletarOrdem(Main.gerenciadorOrdens.procurarOrdem(numeroOrdem));
        }
        for (Usuario usuarioE:usuarios) {
            if (usuarioE instanceof Solicitante){
                usuarioE.getOrdensDeServico().removeIf(ordemDeServicoE -> ordemDeServicoE.getNumeroOrdem() == numeroOrdem);
            }
        }
        return "Ordem Removida";
    }

    @Override
    public String toString() {
        return "Administrador " + super.toString();
    }
}
