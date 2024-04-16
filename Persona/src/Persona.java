public class Persona {
    private int eta;
    private String nome;
    private char sesso;
    private String professione;

    public Persona(int eta, String nome,char sesso, String professione)
    {
        setEta(eta);
        setNome(nome);
        setSesso(sesso);
        setProfessione(professione);
    }

    public int getEta(){return eta;}

    public void setEta(int eta) {this.eta = eta;}

    public String getNome(){return nome;}
    private void setNome(String nome){this.nome = nome;}

    public char getSesso(){return sesso;}
    private void setSesso(char sesso){this.sesso = sesso;}

    public String getProfessione(){return professione;}
    public void setProfessione(String professione){this.professione = professione;}

    public String chiSei(){
        return "Sono una persona di nome: " + nome + ", sono: " + sesso + ", di eta: " + eta + ", di professione: "
                + professione;
    }
}
