public class ContoCorrente {
    private double valore;
    private int n_conto;

    public ContoCorrente(double valore, int n_conto) {
        this.valore = valore;
        this.n_conto = n_conto;
    }

    public double getValore() {return valore;}
    public void setValore(double valore) {this.valore = valore;}

    public int getN_conto() {return n_conto;}
    public void setN_conto(int n_conto) {this.n_conto = n_conto;}

    public void Preleva(double soldi){
        valore -= soldi;
    }

    public void Versa(double soldi){
        valore += soldi;
    }

    @Override
    public String toString() {
        return "ContoCorrente[" +
                "valore -> " + valore +
                ", n_conto ->" + n_conto +
                ']';
    }
}
