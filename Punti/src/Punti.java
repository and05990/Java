public class Punti {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    private void setX(int x) {this.x = x;}

    public int getY() {
        return y;
    }
    private void setY(int y) {this.y = y;}

    public Punti (int x, int y)
    {
        setX(x);
        setY(y);
    }

    public static void main(String[] args)
    {
        Punti p;
        p = new Punti (3, 4);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
