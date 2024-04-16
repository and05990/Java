package geometria;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public Punto(Punto p)
    {
        x = p.getX();
        y = p.getY();
    }

    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
    public double getX(){return x;}
    public double getY(){return y;}

    public double distanza(Punto p)
    {
        double dx = x - p.getX();
        double dy = y - p.getY();
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public boolean equals(Punto p)
    {
        return ((x == p.getX()) && (y == getY()));
    }

    public String toString(){return "("+x+";"+y+")";}

    public static void main(String[] args)
    {
        Punto p1 = new Punto(1.,1.);
        Punto p2 = new Punto(2.,2.);
        Punto p3 = new Punto(3.,3.);

        System.out.println("P1 = " + p1.toString());
        System.out.println("P2 = " + p2.toString());
        System.out.println("P3 = " + p3.toString());

        System.out.println("Distanza P1-P2: " + p1.distanza(p2));
        System.out.println("Distanza P1-P3: " + p1.distanza(p3));

        if(p1.equals(p3))
            System.out.println("P1 e P3 sono uguali");
        else
            System.out.println("Distanza P1-P3 non sono uguali");
    }
}
