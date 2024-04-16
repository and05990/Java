public class Main {
    public static void main(String[] args) {
        Libro l1, l2, l3, l4;
        l1 = new Libro("Il rosmarino non capisce l' inverno", "Matteo Bussola", 160);
        l2 = new Libro("Main Kanpf", "Adolf Hitler", 800);
        l3 = new Libro("Divina Commedia", "Dante Alighieri", 670);

        Mensola m;
        m = new Mensola();
        m.setVolume(l1, 0);
        m.setVolume(l2, 3);
        m.setVolume(l3, 4);

        m.OrdinaMensola();

        /*for(int i = 0; i < Mensola.getNumMaxVolumi(); i++){
            if(m.getVolume(i) != null)
                System.out.println(m.getVolume(i));
        }*/

        l4 = new Libro("Il Pensiero di Mao Tse Tung", "Mao Tse Tung", 218);

        m.aggiungiLibro(2, l4);
        for(int i = 0; i < Mensola.getNumMaxVolumi(); i++){
            if(m.getVolume(i) != null)
                System.out.println(m.getVolume(i));
        }

        /*m.rimuviVolumi(3);
        m.OrdinaMensola();
        for(int i = 0; i < Mensola.getNumMaxVolumi(); i++){
            if(m.getVolume(i) != null)
                System.out.println(m.getVolume(i));
        }*/
    }
}