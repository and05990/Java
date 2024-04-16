import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");    //input nome utente

        Calcolatrice crc = new Calcolatrice(input.nextLine()); //creazione calcolatrice

        char esci;
        do {
            System.out.print("Inserisci a: ");  //input valori
            crc.setA(input.nextDouble());

            System.out.print("Inserisci b: ");
            crc.setB(input.nextDouble());

            if(crc.getA() <= 0  || crc.getB() <= 0)     //controllo se i valori inseriti siano positivi
                System.out.println("I valori inseriti non vanno bene");
            else{

                System.out.print("Inserisci l'operatore: ");    //input operatore e calcolo
                double ris = crc.Calcola(input.next().charAt(0));

                if(ris > -1){       //se operatore sbagliato ritorna -1 quindi da messaggio errore

                    System.out.print("Indovina il risultato: ");    //input per indovinare il risultato
                    double risultatoVocale = input.nextDouble();
                    boolean controlloVocale = crc.verificaRisultatoVocale(risultatoVocale, ris); //controllo del risultato
                    if(controlloVocale)
                        System.out.println(crc.getNome() + " hai indovinato");
                    else
                        System.out.println("Sbagliato");

                    System.out.println("Risultato: " + ris);    //stampa risultato della calcolatrice

                    int statoPile = crc.statoPile();        //controllo stato pile
                    System.out.println("Rimangono: " + statoPile + " operazioni disponibili");

                    boolean verifica = crc.verificaCambioPile();    //cambio pile
                    if(verifica)
                        crc.eseguiCambioPile();
                }
            }
            System.out.print("Premi -q- per uscire: ");     //input carattere per uscire dal programma
            esci = input.next().charAt(0);

            System.out.println();
        }while(esci != 'q');
    }
}