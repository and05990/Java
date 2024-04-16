import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Voto voto;

        System.out.print("Inserisci il massimo di punti: ");
        int range = myObj.nextInt();

        System.out.print("Inserisci la percentuale di sufficienza: ");
        double perSuff = myObj.nextInt();

        System.out.print("Inserisci quanti punti hai fatto: ");
        double points = myObj.nextDouble();


        voto = new Voto(range, perSuff, points);
        voto.calcolaVoto();
        System.out.println(voto.getVoto());
    }
}