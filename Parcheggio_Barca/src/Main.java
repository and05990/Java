import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        ParcheggioBarche p = new ParcheggioBarche();
        String nome, paese;
        int giorni;
        double peso, lunghezza;
        boolean vela;

        boolean corretto = false;
        int scelta = 0;
        do{
            System.out.println("1) Aggiungi barca");
            System.out.println("2) Rimuovi barca");
            System.out.println("3) Salva porto");
            System.out.println("4) Carica porto");
            System.out.println("99) Esci");


            do {
                System.out.print("Inserisci scelta: ");
                try {
                    scelta = input.nextInt();
                    corretto = true;
                } catch (InputMismatchException e) {
                    System.out.println("Errore");
                    input.nextLine();
                }
            }while(!corretto);

            switch (scelta){
                case 1 -> {
                    System.out.println("Inserisci il nome: ");
                    nome = input.nextLine();

                    System.out.println("Inserisci il paese di provenienza: ");
                    paese = input.nextLine();

                    System.out.println("Inserisci il peso: ");
                    peso = input.nextDouble();

                    System.out.println("Inserisci la lunghezza: ");
                    lunghezza = input.nextDouble();

                    System.out.println("Inserisci -true- se a vela -false- se motore: ");
                    vela = input.nextBoolean();

                    Barca b = new Barca(nome, paese, lunghezza, peso, vela);

                    if(b.getVela())
                        p.barcaVelaPos(b);
                    else if (b.getLunghezza() <= 10)
                        p.barcaCorta(b);
                    else
                        p.restoBarche(b);

                }
                case 2 -> {
                        System.out.println("Inserisci il nome: ");
                        nome = input.nextLine();

                        System.out.println("Inserisci il numero di giorni: ");
                        giorni = input.nextInt();

                        p.costo(giorni, nome);
                }
                case 3 -> {
                        p.salvaPorto();
                        System.out.println("Salvato correttamente");
                }

                case 4 -> {
                        p.caricaPorto();
                        System.out.println("Caricato correttamente");
                }

                default ->
                        System.out.println("Operazione non esistente");
                }
        }while(scelta != 99);
    }
}