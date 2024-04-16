public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    private final double COSTO_FISSO = 5.5;


    /*  Constructor  */
    public Libro(String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public Libro(Libro l){
        this.titolo = l.getTitolo();
        this.autore = l.getAutore();
        this.numeroPagine = l.getNumeroPagine();
    }


    /*  Set & Get  */
    public String getTitolo() {return titolo;}
    public void setTitolo(String titolo) {this.titolo = titolo;}

    public String getAutore() {return autore;}
    public void setAutore(String autore) {this.autore = autore;}

    public int getNumeroPagine() {return numeroPagine;}
    public void setNumeroPagine(int numeroPagine) {this.numeroPagine = numeroPagine;}

    public static double getCostoPagina() {return costoPagina;}
    public static void setCostoPagina(double costoPagina) {Libro.costoPagina = costoPagina;}

    public double prezzo(){
        return (numeroPagine * costoPagina) + COSTO_FISSO;
    }


    /*  toString  */
    public String toString() {
        return "Libro: " + titolo +" di " + autore + ", numero pagine: " + numeroPagine;
    }
}
