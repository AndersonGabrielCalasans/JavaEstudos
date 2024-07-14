package AppConta;

public enum Prioridade {

    MIN(1), NORMAL(5), MAX(10);

    private int prioridade;

    Prioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

}
