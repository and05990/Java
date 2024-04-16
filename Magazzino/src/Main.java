import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        Magazzino m = new Magazzino();
        String nome = null;
        double peso = 0, prezzo = 0;
        int scelta = 0;
        boolean errore = true;
        do{
            System.out.println("1) Aggiungi articolo");
            System.out.println("2) Rimuovi articolo");
            System.out.println("3) Compra articolo");
            System.out.println("4) Cerca articolo");
            System.out.println("5) Stampa magazzino");
            System.out.println("97) Salva magazzino");
            System.out.println("98) Carica magazzino");
            System.out.println("99) Exit");

            do {
                System.out.print("Inserisci scelta: ");
                try {
                    scelta = input.nextInt();
                    errore = false;
                } catch (InputMismatchException e) {
                    System.out.println("ERRORE");
                }
                input.nextLine();
            }while(errore);

            errore = true;
            switch(scelta){
                case 1 -> {
                    do {
                        try {
                            System.out.print("Inserisci nome: ");
                            nome = input.nextLine();

                            System.out.print("Inserisci peso: ");
                            peso = input.nextDouble();

                            System.out.print("Inserisci prezzo: ");
                            prezzo = input.nextDouble();

                            errore = false;
                        }catch(InputMismatchException e){
                            System.out.println("Errore");
                        }
                        input.nextLine();
                    }while(errore);
                    if(m.aggiungiArticolo(nome, peso, prezzo) == -1)
                        System.out.println("Errore di inserimento");
                    else
                        System.out.println("Inserimento riuscito");
                }
                case 2 -> {
                    System.out.print("Inserisci nome: ");
                    nome = input.nextLine();

                   if(m.rimuoviArticolo(nome) == -1)
                       System.out.println("Articolo non trovato");
                   else
                       System.out.println("Articolo eliminato");
                }
                case 3 -> {
                    System.out.print("Inserisci nome: ");
                    nome = input.nextLine();
                    prezzo = m.vendita(nome);
                    if(prezzo == -1)
                        System.out.println("Articolo non trovato");
                    else
                        System.out.println("Il prezzo e': " + prezzo);
                }

                case 4 -> {
                    System.out.print("Inserisci nome: ");
                    nome = input.nextLine();

                    String s = m.ricerca(nome);
                    if(s == null)
                        System.out.println("Articolo non trovato");
                    else
                        System.out.println(s);
                }

                case 5 -> {
                    System.out.println(m);
                }

                case 97 -> {
                    m.salvaMagazzino();
                }

                case 98 -> {
                    m.caricaMagazzino();
                }

                default -> {
                    System.out.println("Inserimento non corretto");
                }
            }
            System.out.println();
        }while(scelta != 99);
    }
}