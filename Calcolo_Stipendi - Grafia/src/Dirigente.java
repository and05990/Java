public class Dirigente extends Progetto{
    private static int stipendio = 100; //definisco lo stipendio

    public Dirigente(String nome, String cognome, int codice, int anno_inizio, double ore_lavoro) {
        super(nome, cognome, codice, anno_inizio, ore_lavoro); //richiamo il costruttore della superclasse
    }

    public static void setStipendio(int stipendio_n) {stipendio = stipendio_n;}

    @Override
    public double calcolaStipendio() {
        return super.getOre_lavoro() * stipendio;
    } //calcolo lo stipendio

   /* @Override
    public String toString() { //stampo le informazioni
        String s = "dirigente";
        return super.toString() + s;
    }*/

    @Override
    public String toString() {
        String s = super.toString();
        s += ", Dirigente, stipendio=" + stipendio +
                '}';

        return s;
    }
}