import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ProntoSoccorso p = new ProntoSoccorso();

        Paziente p1 = new Paziente("and", "q", 17, "28/7/05", "abcd", 'r');
        Paziente p2 = new Paziente("skerdi", "v", 17, "28/7/05", "abcd", 'y');
        Paziente p3 = new Paziente("touri", "n", 17, "28/7/05", "abcd", 'w');
        Paziente p4 = new Paziente("ross", "l", 17, "28/7/05", "abcd", 'r');
        Paziente p5 = new Paziente("paul", "po", 17, "28/7/05", "abcd", 'r');

        p.enqueue(p1);
        p.enqueue(p2);
        p.enqueue(p3);
        p.enqueue(p4);
        p.enqueue(p5);
        System.out.println(p.toString());
    }
}