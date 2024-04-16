import java.io.*;
import java.util.Objects;

public class ParcheggioBarche {
    private Barca[] mezzi;
    private final int MAX_NUM_VEICOLI = 100;

    public ParcheggioBarche() {
        this.mezzi = new Barca[MAX_NUM_VEICOLI];
    }

    /*    Posizionamento barca    */

    public int barcaCorta(Barca b){
        int pos = 0;
        while(this.mezzi[pos] != null && pos <= 19)
            pos++;

        if(pos >= 19)
            return -1;
        else
            this.mezzi[pos] = new Barca(b);

        return 0;
    }

    public int restoBarche(Barca b){
        int pos = 21;
        while(this.mezzi[pos] != null && pos <= 51)
            pos++;

        if(pos > 50)
            return -1;
        else
            this.mezzi[pos] = new Barca(b);

        return 0;
    }

    public int barcaVelaPos(Barca b){
        int pos = 52;
        while(this.mezzi[pos] != null && pos <= 100)
            pos++;

        if(pos > 100)
            return -1;
        else
            this.mezzi[pos] = new Barca(b);

        return 0;
    }

    /*   Calcolo costo   */

    public double costo(int giorni, String nome){
        double costo;
        int pos = 0;
        while(!Objects.equals(this.mezzi[pos].getNome(), nome) && pos < MAX_NUM_VEICOLI)
            pos++;

        if(this.mezzi[pos].getVela())
            costo = this.mezzi[pos].getLunghezza() * 10 * giorni;
        else
            costo = this.mezzi[pos].getPeso() * 20 * giorni;
        this.mezzi[pos] = null;
        return costo;
    }

    public void salvaPorto() throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("porto.bin"));
        stream.writeObject(this.mezzi);
        stream.close();
    }

    public void caricaPorto() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("porto.bin"));
        mezzi = (Barca[]) inputStream.readObject();
        inputStream.close();
    }
}