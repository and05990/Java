import java.io.*;
import java.util.Arrays;
public class Magazzino {
    private Articolo[] articoli;
    private final int MAX_ELEMENTI = 100;
    private static int elementi;
    private final int costoMin = 5;
    private final int costoMax = 10;
    private final int peso = 10;

    public Magazzino(){
        this.articoli = new Articolo[MAX_ELEMENTI];
        elementi = 0;
    }

    public static int getElementi() {return elementi;}

    public int aggiungiArticolo(String nome, double peso, double prezzo){
        if(elementi == MAX_ELEMENTI)
            return -1;

        int pos = 0;
        while(articoli[pos] != null && pos < MAX_ELEMENTI)
            pos++;
        this.articoli[pos] = new Articolo(pos + 1, nome, peso, prezzo);
        elementi++;
        return 0;
    }

    public int rimuoviArticolo(String nome){
        int pos = 0;

        while(this.articoli[pos] != null){
            if(this.articoli[pos].getNome().equals(nome)) {
                this.articoli[pos] = null;
                return 0;
            }
            pos++;
        }
        return -1;
    }

    public String ricerca(String nome){
        int pos = 0;
        boolean trovato = false;
        StringBuilder s = new StringBuilder();
        while(!trovato && pos < MAX_ELEMENTI){
            if(this.articoli[pos] != null && this.articoli[pos].getNome().equals(nome)) {
                trovato = true;
               s.append(this.articoli[pos]);
            }
            pos++;
        }
        if(trovato)
            return s.toString();
        else
            return null;
    }

    public double vendita(String nome){
        int pos = 0;
        double prezzo;
        boolean trovato = false;
        while(this.articoli[pos] != null){
            if (this.articoli[pos].getNome().equals(nome)) {
                trovato = true;
                break;
            }
            pos++;
        }
        if(trovato){
            if(this.articoli[pos].getPeso() >= peso){
                prezzo = this.articoli[pos].getPeso() * 10;
            }else{
                prezzo = this.articoli[pos].getPeso() * 5;
            }
            this.articoli[pos] = null;
            return prezzo;
        }else{return -1;}
    }

    @Override
    public String toString() {
        return "Magazzino{" +
                "articoli=" + Arrays.toString(articoli) +
                '}';
    }

    public void salvaMagazzino()throws java.io.IOException{
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Magazzino.bin"));
        stream.writeObject(this.articoli);
        stream.close();
        stream.close();
    }

    public void caricaMagazzino() throws IOException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("Magazzino.bin"));

        try{
            this.articoli = (Articolo[])stream.readObject();
        }
        catch (ClassNotFoundException | IOException e){
            stream.close();
        }

        int pos = 0;
        while(pos < MAX_ELEMENTI){
            if(this.articoli[pos] != null)
                elementi++;
            else
                pos++;
        }
    }
}