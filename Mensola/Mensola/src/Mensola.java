import java.util.Arrays;

public class Mensola {
    private static final int NUM_MAX_VOLUMI = 15;
    private Libro volumi[];

    /*  Constructor  */
    public Mensola(){
        volumi = new Libro[NUM_MAX_VOLUMI];
    }

    public Mensola(Mensola mensola){
        int posizione;

        volumi = new Libro[NUM_MAX_VOLUMI];
        for(posizione = 0; posizione < NUM_MAX_VOLUMI; posizione++){
            if(mensola.getVolume(posizione) != null)
                volumi[posizione] = mensola.getVolume(posizione);
        }
    }


    /*  Set & Get  */
    public int setVolume(Libro libro, int posizione){
        if(posizione < 0 || posizione >= NUM_MAX_VOLUMI)
            return -1;  //posizione non valida
       if(volumi[posizione] != null)
            return -2; //posizione occupata
        volumi[posizione] = libro;
        return posizione;
    }
    public Libro getVolume(int posizione){
        if(posizione < 0 || posizione >= NUM_MAX_VOLUMI)
            return null; //posizione non valida
        return volumi[posizione];
    }

    public static int getNumMaxVolumi(){return NUM_MAX_VOLUMI;}


    /*  Ritorna numero di volumi  */
    public int getNumVolumi(){
        int posizione, n = 0;
        for(posizione = 0; posizione < NUM_MAX_VOLUMI; posizione++){
            if(volumi[posizione] != null)
                n++;
        }
        return n;
    }


    /*  Ordina mensola  */
    public void OrdinaMensola(){
        int posizione;
        for(posizione = 0; posizione < NUM_MAX_VOLUMI; posizione++){
            if(volumi[posizione] == null){  //controllo che la posizione sia vuota
                for(int j = posizione; j < NUM_MAX_VOLUMI; j++) {    //scorro il vettore per controllare le posizioni libere
                    if (volumi[j] != null) {
                        volumi[posizione] = volumi[j];
                        volumi[j] = null;
                        break;
                    }
                }
            }
        }
    }


    /*  Aggiungi libro  */
    public int aggiungiLibro(int posizione, Libro l){
        if(getNumVolumi() >= NUM_MAX_VOLUMI)
            return -1;
        else{
            for(int i = posizione; i < NUM_MAX_VOLUMI; i++) {//sposto i libro con un ciclo al contrario
                if(getNumVolumi() == NUM_MAX_VOLUMI)
                    break;
                volumi[i + 1] = volumi[i];
            }
            for(int i = NUM_MAX_VOLUMI; i > 0; i--){
                if (volumi[i] == volumi[i - 1]) {
                    volumi[i] = null;
                    i--;
                }
            }
            volumi[posizione] = l;
            return posizione;
        }
    }

    /*  Rimuovi volume  */
    public int rimuviVolumi(int posizione){
        if(posizione < 0 || posizione >= NUM_MAX_VOLUMI)
            return -1;  //posizione non valida
        if(volumi[posizione] == null)
            return -2; //posizione vuota
        volumi[posizione] = null;
        return posizione;
    }
}
