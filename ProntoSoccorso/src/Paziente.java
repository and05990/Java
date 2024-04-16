public class Paziente {
    private String nome;
    private String cognome;
    private int eta;
    private String dataNascita;
    private String codiceFiscale;
    private char colore;

    public Paziente(String nome, String cognome, int eta, String dataNascita, String codiceFiscale, char colore) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.colore = colore;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCognome() {return cognome;}
    public void setCognome(String cognome) {this.cognome = cognome;}

    public int getEta() {return eta;}
    public void setEta(int eta) {this.eta = eta;}

    public String getDataNascita() {return dataNascita;}
    public void setDataNascita(String dataNascita) {this.dataNascita = dataNascita;}

    public String getCodiceFiscale() {return codiceFiscale;}
    public void setCodiceFiscale(String codiceFiscale) {this.codiceFiscale = codiceFiscale;}

    public char getColore() {return colore;}
    public void setColore(char colore) {this.colore = colore;}

    @Override
    public String toString() {
        return "Paziente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", dataNascita='" + dataNascita + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", colore=" + colore +
                '}';
    }
}
