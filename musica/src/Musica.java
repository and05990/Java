public class Musica {
    private String autore;
    private String nomeSingolo;
    private String durata;

    public Musica(String autore, String nomeSingolo, String durata)
    {
        setAutore(autore);
        setNomeSingolo(nomeSingolo);
        setDurata(durata);
    }

    public Musica(Musica m)
    {
        this.autore = m.getAutore();
        this.nomeSingolo = m.getNomeSingolo();
        this.durata = m.getDurata();
    }

    public String getAutore() {
        return autore;
    }
    private void setAutore(String autore) {
        this.autore = autore;
    }

    public String getNomeSingolo() {
        return nomeSingolo;
    }
    public void setNomeSingolo(String nomeSingolo) {
        this.nomeSingolo = nomeSingolo;
    }

    public String getDurata() {
        return durata;
    }
    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String toString()
    {
        return "autore: " + autore + ", canzone: " + nomeSingolo + ", durata: " + durata;
    }

    
}
