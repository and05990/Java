public class Nodo {
    private Paziente info;
    private Nodo link;

    public Nodo(Paziente info) {
        this.info = info;
        link = null;
    }

    public Paziente getInfo() {return info;}
    public void setInfo(Paziente info) {this.info = info;}

    public Nodo getLink() {return link;}
    public void setLink(Nodo link) {this.link = link;}
}
