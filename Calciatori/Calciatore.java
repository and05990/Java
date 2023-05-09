package Calciatori;

public class Calciatore {
    private String nome;
    private String cognome;
    private String ruolo;
    private int numeroMaglia;
    private int goal;

    public Calciatore(String nome, String cognome, int numeroMaglia, String ruolo, int goal) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroMaglia = numeroMaglia;
        this.ruolo = ruolo;
        this.goal = goal;
    }

    //make get and set for all the attributes
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    //make a toString method
    @Override
    public String toString() {
        return "Calciatore{" + "nome=" + nome + ", cognome=" + cognome + ", numeroMaglia=" + numeroMaglia + ", ruolo=" + ruolo + '}';
    }
    
}
