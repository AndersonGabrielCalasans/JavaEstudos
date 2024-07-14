package AppSistema;
public class Design extends Funcionario {

    public Design(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

}
