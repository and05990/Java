import java.io.Serializable;

public class Articolo implements Serializable {
    private int codice;
    private String nome;
    private double peso;
    private double prezzo;

    public Articolo(int codice, String nome, double peso, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.peso = peso;
        this.prezzo = prezzo;
    }

    public Articolo(Articolo a){
        this.codice = a.getCodice();
        this.nome =a.getNome();
        this.peso = a.getPeso();
        this.prezzo = a.getPrezzo();
    }
    public int getCodice() {return codice;}
    public void setCodice() {codice++;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public double getPrezzo() {return prezzo;}
    public void setPrezzo(double prezzo) {this.prezzo = prezzo;}

    @Override
    public String toString() {
        return "Articolo{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                ", prezzo=" + prezzo +
                '}';
    }
}