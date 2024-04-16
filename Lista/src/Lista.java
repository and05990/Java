public class Lista {
    private Nodo head;
    private int elementi;

    public Lista(){
       head = null;
       elementi = 0;
    }

    public void insetisciInTesta(char info){
        Nodo p = new Nodo(info);
        p.setLink(head);
        head = p;
        elementi++;

    }

    public int inverti(){
        if(head == null)
            return -1;
        if(head.getLink() == null)
            return -2;

        Nodo p = head, pp = null;
        while (p != null){
            Nodo temp = p.getLink();
            p.setLink(pp);
            pp = p;
            p = temp;
        }
        head = pp;
        return 0;
    }

    public String toString(){
        if(head == null)
            return null;

        String s = "";
        Nodo p = head;
        while (p != null){
            s += p.getInfo() + " ";
            p = p.getLink();
        }
        return s;
    }
}
