package calasansbank;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private static int total;

    public Cliente(String nome, String cpf) {
        // Atributo total é static da classe Cliente
        Cliente.total++;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
}

    // Metodo Static da Classe Cliente
    public static int getTotal() {
        return Cliente.total;
    }

}