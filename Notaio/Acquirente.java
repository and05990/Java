package Notaio;
public class Acquirente {
    private String nome;
    private String cognome;
    private String email;
    private int numero;
    private double prezzo;
    private double caparra;
    private double mutuo;
    private boolean venditore;

    public Acquirente(String nome, String cognome, String email, int numero, double prezzo, double caparra, double mutuo, boolean venditore) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numero = numero;
        this.prezzo = prezzo;
        this.caparra = caparra;
        this.mutuo = mutuo;
        this.venditore = venditore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getCaparra() {
        return caparra;
    }

    public void setCaparra(double caparra) {
        this.caparra = caparra;
    }

    public double getMutuo() {
        return mutuo;
    }

    public void setMutuo(double mutuo) {
        this.mutuo = mutuo;
    }

    public boolean isVenditore() {
        return venditore;
    }

    public void setVenditore(boolean venditore) {
        this.venditore = venditore;
    }

    //make a simple toString() method
    @Override
    public String toString() {
        return "Acquirente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", numero=" + numero +
                ", prezzo=" + prezzo +
                ", caparra=" + caparra +
                ", mutuo=" + mutuo +
                ", venditore=" + venditore +
                '}';
    }
}
