import java.util.ArrayList;

public class Atendente extends Usuario{
    public Atendente(float cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public String toString() {
        return "Atendente " + super.toString();
    }
}


