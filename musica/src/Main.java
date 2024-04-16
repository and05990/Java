public class Main {
    public static void main(String[] args)
    {
        Musica canzone1, canzone2, canzone1Copia;
        canzone1 = new Musica("Negretto", "Non pago affitto", "1:30");
        canzone2 = new Musica("Bianco", "Sono gay", "7:69");
        canzone1Copia = new Musica(canzone1);
        System.out.println(canzone1.toString());
        System.out.println(canzone2.toString());
        System.out.println(canzone1Copia.toString());
    }
}