import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContoCorrente conto = new ContoCorrente(1500, 234);

        double soldi;
        int scelta = 0;
        do{
            System.out.println("-*-* CONTO CORRENTE *-*-");
            System.out.println();
            System.out.println("1) Preleva");
            System.out.println("2) Versa");
            System.out.println("3) Estratto Conto");
            System.out.println("99) exit");

            try {
                System.out.print("Premi il numero dell'azione che vuoi eseguire: ");
                scelta = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("-- ERRORE --");
                System.out.println();
                input.next();
            }

            switch (scelta){
                case 1 -> {
                    System.out.print("Inserisci soldi da prelevare: ");
                    soldi = input.nextInt();
                    while(soldi <= 0 || soldi > conto.getValore()){
                        System.out.println("-- ERRORE --");
                        System.out.print("Inserisci un importo corretto: ");
                        soldi = input.nextInt();
                    }
                    conto.Preleva(soldi);
                }
                case 2 -> {
                    System.out.print("Inserisci soldi da versare: ");
                    soldi = input.nextInt();
                    while(soldi <= 0){
                        System.out.println("-- ERRORE --");
                        System.out.print("Inserisci un importo corretto: ");
                        soldi = input.nextInt();
                    }
                    conto.Preleva(soldi);
                }
                case 3 -> {
                    System.out.println(conto);
                }
                default -> {
                    System.out.println("Inserisci un operazione valida");
                }
            }

            System.out.println();
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println();
        }while(scelta != 99);
    }
}