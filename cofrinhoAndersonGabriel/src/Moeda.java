/*
 * Classe abstrata Moeda
 */

public abstract class Moeda {

    private double valor;
    private String tipoMoeda;

    
    //Construtor da classe
    Moeda(double valor){
        this.valor = valor;
    }
    
    // Getters and setters
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }
    
    // metodo converter padrao
    public double converter(){
        return getValor();
    }

    //metodo info padrao
    public void info() {
        System.out.println(getValor());
    }

}
