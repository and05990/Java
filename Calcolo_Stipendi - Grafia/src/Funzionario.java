public class Funzionario extends Progetto{
    private static int stipendio_junior = 70; //definisco lo stipendio
    private static int stipendio_senior = 80;

    public Funzionario(String nome, String cognome, int codice, int anno_inizio, double ore_lavoro) {
        super(nome, cognome, codice, anno_inizio, ore_lavoro); //richiamo il costruttore della superclasse
    }

    public static void setStipendio_junior(int stipendio) {stipendio_junior = stipendio;}
    public static void setStipendio_senior(int stipendio) {stipendio_senior = stipendio;}

    private boolean Junior() {return ((Progetto.getAnno_corrente() - super.getAnno_inizio()) < 10);} //controllo se il funzionario è junior o senior

    @Override
    public double calcolaStipendio() { //calcolo lo stipendio
        boolean junior = Junior();
        if(junior) {
            return super.getOre_lavoro() * stipendio_junior;
        } else {
            return super.getOre_lavoro() * stipendio_senior;
        }
    }

    @Override
    public String toString() { //stampo le informazioni
        String s = "funzionario";
        boolean junior = Junior();
        if(junior) {
            return super.toString() + s + " junior";
        } else {
            return super.toString() + s + " senior";
        }
    }
}