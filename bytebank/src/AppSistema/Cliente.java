package AppSistema;
public class Cliente implements Altenticavel {

    private AutenticacaoUtil autenticador;

    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

}
