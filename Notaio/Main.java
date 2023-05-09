package Notaio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Acquirente> notaio = new ArrayList<>();

        Acquirente a1 = new Acquirente("Mario", "Rossi", "mario.rossi@gmail.com", 123456789, 100000, 10000, 90000, false);
        Acquirente a2 = new Acquirente("Luigi", "Verdi", "luigi.verdi@gmail.com", 987654321, 200000, 20000, 180000, false);
        Acquirente a3 = new Acquirente("Giovanni", "Bianchi", "giovanni.bianchi@gmail.com", 123456789, 300000, 30000, 270000, false);

        notaio.add(a1);
        notaio.add(a2);
        notaio.add(a3);

        notaio.sort(Comparator.comparing(Acquirente::getCognome));

        Iterator<Acquirente> it = notaio.iterator();
        while (it.hasNext()) {
             System.out.println(it.next());
        }
    }   
}