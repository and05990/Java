public class Main {
    public static void main(String[] args)
    {
        Computer c, c2, c3;
        c = new Computer("HPv1.0", "Andrea Quagliotti", "v1.0.0", "Windows10", 2021);
        c2 = new Computer("HPv2.0", "Andrea Quagliotti", "v2.0.0", "Windows11/10/8", 2022);
        c3 = new Computer(c);

        //System.out.println(c.toString());
        //System.out.println(c2.toString());

        int comp = c.compareAnno(c2);

        if(comp == 1)
            System.out.println(c.toString() + " e' piu' moderno di " + c2.toString());
        else if(comp == 2)
            System.out.println(c2.toString() + " e' piu' moderno di " + c.toString());
        else
            System.out.println(c.toString() +" e " + c2.toString() + " sono uguali");

        System.out.println(c3.toString());
    }
}