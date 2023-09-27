import java.util.ArrayList;

public class Main {
    static Solicitante solicitante = new Solicitante(123, "Davi");
    static Atendente atendente = new Atendente(1234, "José");
    static Administrador administrador = new Administrador(12345, "Mario");
    static int i = 0;
    static Relatorio relatorio = new Relatorio();
    static GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();

    public static void main(String[] args) {
        criar();
        visualizar();
        editar();
        remover();
        novoStatus(gerenciadorOrdens.procurarOrdem(0));
        gerarRelatorio(gerenciadorOrdens.procurarOrdem(0));

    }

    public static void criar() {
        System.out.println("Criando");
        OrdemInstalacao ordemInstalacao = new OrdemInstalacao(i++, "Acrilico para ar condicionado", "Para Fazer", solicitante, "31/10");
        System.out.println(administrador.criarOrdem(ordemInstalacao));
        OrdemManutencao ordemManutencao = new OrdemManutencao(i++, "Torno não liga", "Para Fazer", "Torno", "21/09");
        System.out.println(solicitante.criarOrdem(ordemManutencao));
        OrdemManutencao ordemManutencao2 = new OrdemManutencao(i++, "Frezadeira não liga", "Para Fazer", "Frezadeira", "21/09");
        System.out.println(atendente.criarOrdem(ordemManutencao2));

    }

    public static void visualizar() {
        System.out.println("Visualizando");
        System.out.println(solicitante.verOrdens());
        System.out.println(administrador.verOrdens());
    }

    public static void editar() {
        System.out.println("Editando");
        int numeroDaOrdem = 1;
        OrdemManutencao ordemManutencaoEditada = new OrdemManutencao(numeroDaOrdem, "Torno não liga", "Pronto", "Torno", "21/09(Concluido)");
        System.out.println(administrador.editarOrdem(numeroDaOrdem, ordemManutencaoEditada));;
        visualizar();
    }

    public static void remover() {
        System.out.println("Removendo");
        int numeroDaOrdem = 2;
        System.out.println(administrador.deletarOrdem(numeroDaOrdem));
        visualizar();
    }
    public static void novoStatus(OrdemDeServico ordemDeServico){
        System.out.println("Atualizando status");
        ordemDeServico.atualizarStatus("Novo Status");
        visualizar();
    }
    public static void gerarRelatorio(OrdemDeServico ordem){
        System.out.println("Gerando relatorio");
        System.out.println(relatorio.gerarRelatorio(ordem));
    }
}
