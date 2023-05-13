public class Tecnico extends Progetto{
    private boolean informatico; //definisco se il tecnico è informatico o elettronico
    private boolean interno; //definisco se il tecnico è interno o esterno
    private static int stipendio_informatico = 40; //definisco lo stipendio
    private static int stipendio_elettronico = 50;

    public Tecnico(String nome, String cognome, int codice, int anno_inizio, double ore_lavoro, boolean informatico, boolean interno) {
        super(nome, cognome, codice, anno_inizio, ore_lavoro); //richiamo il costruttore della superclasse
        this.informatico = informatico;
        this.interno = interno;
    }

    public int getStipendio_informatico() {return stipendio_informatico;}
    public int getStipendio_elettronico() {return stipendio_elettronico;}
    public static void setStipendio_informatico(int stipendio) {stipendio_informatico = stipendio;}
    public static void setStipendio_elettronico(int stipendio) {stipendio_elettronico = stipendio;}

    @Override
    public double calcolaStipendio() { //calcolo lo stipendio
        double stipendio = 0;
        if (informatico && interno) { //informatico interno
            stipendio = (stipendio_informatico * super.getOre_lavoro()) + (Progetto.getAnno_corrente() - super.getAnno_inizio());
        } else if (informatico && !interno) { //informatico esterno
            stipendio = (stipendio_informatico * super.getOre_lavoro());
        } else if(!informatico && interno) { //elettronico interno
            stipendio = (stipendio_elettronico * super.getOre_lavoro()) + (Progetto.getAnno_corrente() - super.getAnno_inizio());
        } else if(!informatico && !interno) { //elettronico esterno
            stipendio = (stipendio_elettronico * super.getOre_lavoro());
        } else{
            stipendio = -1; //errore
        }
        return stipendio;
    }

    @Override
    public String toString() { //stampo le informazioni
        String s;
        if (informatico && interno) {
            s = "informatica/telecomunicazioni interno";
        } else if (informatico && !interno) {
            s = "informatica/telecomunicazioni esterno";
        } else if(!informatico && interno) {
            s = "elettronica/automazione interno";
        } else if(!informatico && !interno) {
            s = "elettronica/automazione esterno";
        } else{
            s = "non trovato";
        }
        return super.toString() + s;
    }
}