package AppSistema;
public class ControleBonificacao {

    private double totalBonus = 0;

    public double getTotalBonus() {
        return totalBonus;
    }

    // Com o polimorfismo não é necessário colocar um metodo especifico para cada classe
    // basta apenas referenciar para o mais genérico e o metodo retorna o mais especifico
    public void registra(Funcionario funcionario){
        double bonus = funcionario.getBonificacao();
        this.totalBonus += bonus;
    }
}
