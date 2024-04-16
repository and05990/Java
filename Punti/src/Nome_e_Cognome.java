public class Nome_e_Cognome {

    private String nome;
    private String cognome;

    public String getNome() {return nome;}
    public String getCognome() {return cognome;}

    private void setNome(String nome) {this.nome = nome;}
    private void setCognome(String cognome) {this.cognome = cognome;}

    public Nome_e_Cognome (String nome, String cognome)
    {
        setNome(nome);
        setCognome(cognome);
    }

    public static void main (String[] args)
    {
        Nome_e_Cognome dati;
        dati = new Nome_e_Cognome("Andrea", "Quagliotti");

        System.out.println(dati.getNome());
        System.out.println(dati.getCognome());
    }
}
