public class Main {
    public static void main(String[] args){
        Punto pA = new Punto(1, 3);
        Punto pB = new Punto(4, 5);

        Segemto s = new Segemto(pA, pB);

        System.out.println(s.getA().getX() + " " + s.getA().getY());
    }

}