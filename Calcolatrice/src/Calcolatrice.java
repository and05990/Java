public class Calcolatrice {
    private final String nome;
    private double a;
    private double b;
    private int nOp;
    private final int nDefOP;

    public Calcolatrice(String nome) {
        nDefOP = 2;
        this.nome = nome;
        setA(a);
        setB(b);
    }


    /*  Set & Get   */
    public double getA() {return a;}
    public void setA(double a) {this.a = a;}

    public double getB() {return b;}
    public void setB(double b) {this.b = b;}

    public String getNome() {return nome;}


    /*  Calcolatrice  */
    public double Calcola(char op){
        nOp++;
        switch (op) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                if (a > b)
                    return a - b;
                else
                    return b - a;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                    return a / b;
            }
            default -> {
                System.out.println("Operatore sbagliato");
                return -1;
            }
        }
    }


    /*  Pile  */
    public boolean verificaCambioPile(){
        return nOp == nDefOP;
    }

    public void eseguiCambioPile() {
        nOp = 0;
        System.out.println("Cambio pile eseguito");
    }

    public int statoPile(){
        return nDefOP - nOp;
    }


    /*  Verifica Vocale  */
    public boolean verificaRisultatoVocale(double risVocale, double ris) {
        return risVocale == ris;
    }
}