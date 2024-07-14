/*
 * Classe Real estende da classe Moeda e sobrescreve o metodo info.
 */

public class Real extends Moeda{

    Real(double valor) {
        super(valor);
        setTipoMoeda("Real");
    }

    @Override
    public void info(){
        System.out.print("Real - ");
        super.info();
    }
}
