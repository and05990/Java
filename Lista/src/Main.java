public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();

        l.insetisciInTesta('d');
        l.insetisciInTesta('c');
        l.insetisciInTesta('b');
        l.insetisciInTesta('a');

        System.out.println(l);

        l.inverti();

        System.out.println(l);

    }
}