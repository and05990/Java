public class Computer {
    private String denominazione;
    private String produttore;
    private String versione;
    private String so;
    private int anno;

    public Computer(String denominazione, String produttore, String versione, String so, int anno)
    {
        setDenominazione(denominazione);
        setProduttore(produttore);
        setVersione(versione);
        setSo(so);
        setAnno(anno);
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Computer(Computer c)
    {
        this.denominazione = c.getDenominazione();
        this.produttore = c.getProduttore();
        this.versione = c.getVersione();
        this.so = c.getSo();
        this.anno = c.getAnno();
    }

    public String toString() {
        return denominazione + " prodotto da " + produttore + " in versione " + versione + " " + anno +" per " + so;
    }

    public int compareAnno(Computer c2)
    {
        if(anno > c2.getAnno())
            return 1;
        else if(anno < c2.getAnno())
            return 2;
        else
            return 3;
    }

}

