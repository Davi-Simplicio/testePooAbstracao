
public class Solicitante extends Usuario{

    public Solicitante(float cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public String editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        this.getOrdensDeServico().set(numeroOrdem,ordem);
        for (OrdemDeServico ordemE:Main.gerenciadorOrdens.getOrdensDeServiçoGerenciador()) {
            if (ordemE.getNumeroOrdem()==numeroOrdem){
                Main.gerenciadorOrdens.getOrdensDeServiçoGerenciador().set(Main.gerenciadorOrdens.getOrdensDeServiçoGerenciador().indexOf(ordemE),ordem);
            }
        }
        return "Ordem Editada";
    }

    @Override
    public String verOrdens() {
        String mostrarOrdens="";
        for (OrdemDeServico ordemE:this.getOrdensDeServico()) {
            mostrarOrdens += "Numero da ordem["+ordemE.getNumeroOrdem()+"]"+ordemE.mostrarDados()+"\n";
        }
        return mostrarOrdens;
    }

    @Override
    public String toString() {
        return "Solicitante " + super.toString();
    }
}
