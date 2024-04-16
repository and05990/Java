public class ProntoSoccorso {
    private Nodo head;
    private Nodo tailRed;
    private int rossi = 0;
    private Nodo tailYellow;
    private int gialli = 0;
    private Nodo tailWhite;
    private int bianchi = 0;

    public ProntoSoccorso() {
        head = null;
        tailRed = null;
        tailYellow = null;
        tailWhite = null;
    }

    public int getRossi() {return rossi;}
    public void setRossi(int rossi) {this.rossi = rossi;}

    public int getGialli() {return gialli;}
    public void setGialli(int gialli) {this.gialli = gialli;}

    public int getBianchi() {return bianchi;}
    public void setBianchi(int bianchi) {this.bianchi = bianchi;}

    public void enqueue(Paziente m){
        Nodo p = new Nodo(m);
        if(head == null){
            tailRed = p;
            head = tailRed;
            rossi++;
        }else{
            char c = m.getColore();
            if(c == 'r') {
                tailRed.setLink(p);
                tailRed = p;
                rossi++;
            }else if (c == 'y') {
                tailYellow.setLink(p);
                tailYellow = p;
                gialli++;
            }else if(c == 'w'){
                tailWhite.setLink(p);
                tailWhite = p;
                bianchi++;
            }
        }
    }

    public String eliminaPaziente(String nome){
        Nodo p = head;
        boolean trovato = false;
        String s = null;
        while (p != null && !trovato){
            if(p.getInfo().getNome().equals(nome)){
                s += p.getInfo();
                trovato = true;
            }
            p = p.getLink();
        }
        if(trovato)
            return s;
        else
            return "Paziente non trovato";
    }

}
