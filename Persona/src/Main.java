public class Main {
    public static void main(String[] args) {
        Persona p, p1;
        p = new Persona(18, "Taranpreet", 'm', "gamer");
        p1 = new Persona(18, "aakash", 'm', "studente");

        if(p.getEta() > p1.getEta())
            System.out.println(p.chiSei());
        else if (p.getEta() == p1.getEta())
            System.out.println("Hanno la stessa eta");
        else
            System.out.println(p1.chiSei());
    }
}