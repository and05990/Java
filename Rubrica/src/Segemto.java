public class Segemto {
    private Punto a;
    private Punto b;

    public Segemto(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public Punto getA() {
        return a;
    }

    public void setA(Punto a) {
        this.a = a;
    }

    public Punto getB() {
        return b;
    }

    public void setB(Punto b) {
        this.b = b;
    }

    public double distanza(){
        double dist = (a.getX() + b.getX())*(a.getY() + b.getY());
        return dist;
    }
}
