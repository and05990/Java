import java.io.*;

public class Parola {
    private Nodo head;
    private int elementi;

    public Parola(){
        head = null;
        elementi = 0;
    }

    public void inserisciInTesta(char lettera){
        Nodo l = new Nodo(lettera);
        l.setLink(head);
        head = l;
        elementi++;
        // System.out.println(elementi);
    }

    public void inserisciInCoda(char lettera){
        Nodo pn = new Nodo(lettera);

        if (head == null)
            head = pn;
        else {
            Nodo p = head;
            while (p.getLink() != null)
                p = p.getLink();

            p.setLink(pn);
        }
        elementi++;
        // System.out.println(elementi);
    }

    public int inserisciInPosizione(char lettera, int posizione){
        Nodo pn = new Nodo(lettera);
        int i = 1;

        if (posizione < 0)
            return -1;
        if (posizione == 1) {
            inserisciInTesta(lettera);

        return 0;
        }

        Nodo p = head;

        if (posizione > elementi)
            inserisciInCoda(lettera);
        else {
            while (i < posizione - 1){
                p = p.getLink();
                i++;
            }
            pn.setLink(p.getLink());

            p.setLink(pn);
            elementi++;
        }

        return 0;

    }

    public int eliminaInTesta(){
        if (head != null)
            head = head.getLink();
        else
            return -1;

        elementi--;
        return 0;
    }

    public int eliminaInCoda(){
       Nodo pp = head;

       if(pp == null)
           return -1; //lista vuota

       Nodo ps = head;
       while(ps.getLink() != null){
           pp = ps;
           ps = ps.getLink();
       }
       if(pp == head)
           eliminaInTesta();
       else
           pp.setLink(null);

       elementi--;
       return 0;
    }

    public int eliminaInPosizione(int pos){
        if(pos <= 1)
            eliminaInTesta();
        else if(pos >= elementi)
            eliminaInCoda();
        else{
            Nodo pp, ps;
            pp = getLinkPosizione(pos - 1);
            if(pp == null)
                return -1;
            ps = pp.getLink();
            pp.setLink(ps.getLink());
        }
        elementi--;
        return 0;
    }

    public Nodo getLinkPosizione(int pos){
        if(pos > elementi || pos < 1)
            return null;
        else{
            Nodo p = head;
            int i = 1;

            while(p.getLink() != null && i < pos){
                p = p.getLink();
                i++;
            }
            return p;
        }
    }

    @Override
    public String toString(){
        Nodo p = head;
        String s = "Parola: ";
        while (p != null) {
            s = s + p.getInfo();
            p = p.getLink();
        }
        return s;
    }
}