public class Voto{

    private double voto = 0;
    public int range;
    public double percentualeSufficienza;
    public double punti;

    public Voto(int range, double percentualeSufficienza, double punti)
    {
        setRange(range);
        setPercentualeSufficienza(percentualeSufficienza);
        setPunti(punti);
    }

    public double getVoto(){return voto;}
    private void setVoto(double voto){this.voto = voto;}

    public int getRange(){return range;}
    public void setRange(int range){this.range = range;}

    public double getPercentualeSufficienza(){return percentualeSufficienza;}
    public void setPercentualeSufficienza(double percentualeSufficienza)
    {this.percentualeSufficienza = percentualeSufficienza;}

    public double getPunti(){return punti;}
    public void setPunti(double punti){this.punti = punti;}

    public void calcolaVoto(){
        voto = punti/10;

        double temp = voto / (1 + percentualeSufficienza/100);
        System.out.println(temp);
        voto = voto - temp;
    }
}