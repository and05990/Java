import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ParcoVeicolo parco = new ParcoVeicolo();  //creo un parco veicoli
        String targa, marca, modello; //dichiarazone variabili
        int n_posti, codice; //dichiarazioni variabili
        Veicolo v; //creo un veicolo

        int scelta; //creo il menu di scelta
        do {
            System.out.println("-*-*- PARCHEGGIO AUTO -*-*-");
            System.out.println("1) Aggiungi veicolo");
            System.out.println("2) Rimuovi veicolo");
            System.out.println("3) Inventario");
            System.out.println("99) esci");

            System.out.print("Inserisci il numero dell'operazione: ");
            scelta = input.nextInt();

            switch (scelta) {
                case 1 -> {     //inserisco i dati del veicolo
                    System.out.print("Inserisci la targa: ");
                    targa = input.nextLine();

                    input.nextLine();
                    System.out.print("Inserisci la marca: ");
                    marca = input.nextLine();

                    System.out.print("Inserisci il modello: ");
                    modello = input.nextLine();

                    System.out.print("Inserisci il numero dei posti: ");
                    n_posti = input.nextInt();

                    input.nextLine();
                    v = new Veicolo(targa, marca, modello, n_posti);
                    codice = parco.setVeicolo(v);
                    if (codice == -1) {     //controllo se il parco e' pieno
                        System.out.println("Parco pieno");
                    }
                }
                case 2 -> {     //rimuovo veicolo
                    System.out.print("Inserisci la targa del veicolo da rimuovere: ");
                    targa = input.nextLine();
                    if (parco.rimuoviVeicolo(targa) == 0)
                        System.out.print("Veicolo rimosso");
                    else
                        System.out.print("Veicolo non torvato");
                }
                case 3 -> {     //stampo inventario
                    System.out.print("Inserisci il numero dei posti: ");
                    n_posti = input.nextInt();
                    System.out.println(Arrays.toString(parco.inventarioVeicoliPosti(n_posti)));
                    System.out.println(Arrays.toString(parco.inventarioVeicoliMarca()));
                }
            }

            System.out.println();
            System.out.print("Inserisci -99- per uscire: "); //input per uscire dal programma
            scelta = input.nextInt();
            System.out.println();

        }while(scelta != 99);
    }
}