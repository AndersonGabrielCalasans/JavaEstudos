/*
 * Classe Euro estende da classe Moeda e sobrescreve os metodos converter e info.
 */

public class Euro extends Moeda {

    // construtor da classe
    Euro(double valor) {
        super(valor);
        setTipoMoeda("Euro");
    }

    @Override
    public double converter() {
        return getValor()*5.91;
    }

    @Override
    public void info() {
        System.out.print("Euro - ");
        super.info();
    }
}
