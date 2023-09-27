import java.util.ArrayList;

public class GerenciadorOrdens implements Imprimivel{

    private ArrayList<OrdemDeServico>ordensDeServiçoGerenciador = new ArrayList<>();

    public ArrayList<OrdemDeServico> getOrdensDeServiçoGerenciador() {
        return ordensDeServiçoGerenciador;
    }


    public void criarOrdem(OrdemDeServico ordem) {
        ordensDeServiçoGerenciador.add(ordem);
    }

    public void deletarOrdem(OrdemDeServico ordem) {
        ordensDeServiçoGerenciador.remove(ordem);
    }

    public OrdemDeServico procurarOrdem(int numeroOrdem) {
        for (OrdemDeServico ordemE:ordensDeServiçoGerenciador) {
            if (ordemE.getNumeroOrdem()==numeroOrdem){
                return ordemE;
            }
        }
        return null;
    }

    @Override
    public String mostrarDados() {
        String mostrarDados="";
        for (OrdemDeServico ordemE:ordensDeServiçoGerenciador) {
            mostrarDados += ordemE.mostrarDados()+"\n";
        }
        return mostrarDados;
    }
}
