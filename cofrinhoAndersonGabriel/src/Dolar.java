/*
 * Classe Dolar estende da classe Moeda e sobrescreve os metodos converter e info.
 */

public class Dolar extends Moeda {
    
    
    Dolar(double valor) {
        super(valor);
        setTipoMoeda("Dolar");
    }

    @Override
    public double converter() {
        return getValor()*5.44;
    }

    @Override
    public void info(){
        System.out.print("Dolar - ");
        super.info();
    }

}
