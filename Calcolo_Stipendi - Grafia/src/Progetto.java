abstract public class Progetto {
    private String nome;
    private String cognome;
    private int codice;
    private int anno_inizio;
    private double ore_lavoro;
    private static int anno_corrente = 2023;

    public Progetto(String nome, String cognome, int codice, int anno_inizio, double ore_lavoro) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.anno_inizio = anno_inizio;
        this.ore_lavoro = ore_lavoro;
    }

    public String getNome() {return nome;}
    public String getCognome() {return cognome;}
    public int getCodice() {return codice;}
    public int getAnno_inizio() {return anno_inizio;}
    public double getOre_lavoro() {return ore_lavoro;}
    public static int getAnno_corrente() {return anno_corrente;}

    abstract public double calcolaStipendio();

    public double getCosto() {
        return calcolaStipendio();
    } //calcolo il costo complessivo

    @Override
    public String toString() { //stampo le informazioni
        return "nome: " + nome + " cognome: " + cognome + " codice: " + codice + " anno di inizio: " + anno_inizio + " ";
    }
}