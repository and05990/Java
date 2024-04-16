import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Parola p = new Parola();

        int scelta = 0;
        int posizione = 0;
        char carattere = 0;
        boolean corretto = false;
        do {
            System.out.println("1) Inserisci in posizione");
            System.out.println("2) Inserisci in testa");
            System.out.println("3) Inserisci in coda");
            System.out.println("4) Elimina in testa");
            System.out.println("5) Elimina in coda");
            System.out.println("6) Elimina in posizione");
            System.out.println("55) Stampa");
            System.out.println("99) exit");
            System.out.println();

            do {
                System.out.print("Inserisci la scelta: ");
                try {
                    scelta = input.nextInt();
                    corretto = true;
                } catch (InputMismatchException e) {
                    System.out.println("ERRORE di INSERIMENTO");
                    System.out.println();
                    input.nextLine();
                }
            } while (!corretto);

            corretto = false;
            switch (scelta) {
                case 1 -> {
                    do {
                        System.out.print("Inserisci la posizione: ");
                        try {
                            posizione = input.nextInt();
                            corretto = true;
                        } catch (InputMismatchException e) {
                            System.out.println("ERRORE di INSERIMENTO");
                            System.out.println();
                            input.nextLine();
                        }


                    }while(!corretto);


                    corretto = false;

                    do {
                        System.out.print("Inserisci la lettera: ");
                        try {
                            carattere = input.next().charAt(0);
                            corretto = true;
                        } catch (InputMismatchException e) {
                            System.out.println("ERRORE di INSERIMENTO");
                            System.out.println();
                            input.next().charAt(0);
                        }
                    }while(!corretto);

                    if(p.inserisciInPosizione(carattere, posizione) == 0)
                        System.out.println("Inserimento completato correttamente");
                    else
                        System.out.println("Inserimento non completato correttamente");
                }

                case 2 -> {
                    do {
                        System.out.print("Inserisci la lettera: ");
                        try {
                            carattere = input.next().charAt(0);
                            corretto = true;
                        }catch (InputMismatchException e){
                            System.out.println("ERRORE di INSERIMENTO");
                            System.out.println();
                            input.next().charAt(0);
                        }
                    }while(!corretto);
                    p.inserisciInTesta(carattere);
                }

                case 3 -> {
                    do {
                        System.out.print("Inserisci la lettera: ");
                        try {
                            carattere = input.next().charAt(0);
                            corretto = true;
                        }catch (InputMismatchException e){
                            System.out.println("ERRORE di INSERIMENTO");
                            System.out.println();
                            input.next().charAt(0);
                        }
                    }while(!corretto);
                    p.inserisciInCoda(carattere);
                }

                case 4 -> {
                    if(p.eliminaInTesta() == 0)
                        System.out.println("Eliminato correttamente");
                    else
                        System.out.println("Eliminazione non riuscita");
                }

                case 5 -> {
                    if(p.eliminaInCoda() == 0)
                        System.out.println("Eliminato correttamente");
                    else
                        System.out.println("Eliminazione non riuscita");
                }

                case 6 -> {


                    do {
                        System.out.print("Inserisci la posizione: ");
                        try {
                            posizione = input.nextInt();
                            corretto = true;
                        } catch (InputMismatchException e) {
                            System.out.println("ERRORE di INSERIMENTO");
                            System.out.println();
                            input.nextInt();
                        }
                    }while(!corretto);

                    if(p.eliminaInPosizione(posizione) == 0)
                        System.out.println("Eliminato correttamente");
                    else
                        System.out.println("Eliminazione non riuscita");
                }

                case 55 ->
                    System.out.println(p.toString());

                default ->
                    System.out.println("Inserimento non valido");
            }
            System.out.println();
        } while (scelta != 99);

        System.out.println(p.toString());
    }
}