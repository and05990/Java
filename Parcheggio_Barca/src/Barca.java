public class Barca {
    private String nome;
    private String paese;
    private double lunghezza;
    private double peso;
    private boolean vela;

    public Barca(String nome, String paese, double lunghezza, double peso, boolean vela) {
        this.nome = nome;
        this.paese = paese;
        this.lunghezza = lunghezza;
        this.peso = peso;
        this.vela = vela;
    }

    public Barca(Barca b) {
        this.nome = b.getNome();
        this.paese = b.getPaese();
        this.lunghezza = b.getLunghezza();
        this.peso = b.getPeso();
        this.vela = b.getVela();
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getPaese() {return paese;}
    public void setPaese(String paese) {this.paese = paese;}

    public double getLunghezza() {return lunghezza;}
    public void setLunghezza(double lunghezza) {this.lunghezza = lunghezza;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public boolean getVela() {return vela;}
    public void setVela(boolean vela) {this.vela = vela;}

    @Override
    public String toString() {
        return "Barca{" +
                "nome='" + nome + '\'' +
                ", paese='" + paese + '\'' +
                ", lunghezza=" + lunghezza +
                ", peso=" + peso +
                ", vela=" + vela +
                '}';
    }
}