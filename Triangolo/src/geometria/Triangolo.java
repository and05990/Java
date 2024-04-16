package geometria;

 class Triangolo {
     private Punto a;
     private Punto b;
     private Punto c;

     private final double ERR_MAX = 0.00000001;

     public Triangolo(Punto a, Punto b, Punto c)
     {
         setA(a);
         setB(b);
         setC(c);
     }

     public Triangolo (Triangolo t)
     {
         setA(t.getA());
         setB(t.getB());
         setC(t.getC());
     }

     public void setA(Punto a){this.a = new Punto(a);}
     public void setB(Punto b){this.b = new Punto(b);}
     public void setC(Punto c){this.c = new Punto(c);}

     public Punto getA(){return a;}
     public Punto getB(){return b;}
     public Punto getC(){return c;}

     public double area()
     {
         double p = perimetro()/2;
         return Math.sqrt(p*(p - a.distanza(b)) * (p - b.distanza(c)) * (p - c.distanza(a)));
     }
     public double perimetro()
     {
         return a.distanza(b) + b.distanza(c) + c.distanza(a);
     }

     public String toString()
     {
         String msg = "";
         if (area() <= ERR_MAX) msg = "NON E' UN TRIANGOLO";
         return " A" + a.toString() +" B" + b.toString() +" C" + c.toString() + msg;
     }
     public boolean equals(Triangolo t)
     {
         return ((a.equals(t.a)) &&(b.equals(t.b)) && (c.equals(t.c)));
     }

     public boolean equivale(Triangolo t)
     {
         return (Math.abs(this.area() - t.area()) <= ERR_MAX);
     }

     public static void main (String[] args)
     {
         Punto p1 = new Punto(1., 1.);
         Punto p2 = new Punto(2., 2.);
         Punto p3 = new Punto(2., 2.);
         Punto p4 = new Punto(2., 2.);
         Punto p5 = new Punto(3., 3.);

         Triangolo t1 = new Triangolo(p1, p2, p3);
         Triangolo t2 = new Triangolo(p1, p3, p4);
         Triangolo t3 = new Triangolo(p1, p2, p3);
         Triangolo t4 = new Triangolo(t1);

         System.out.println("Triangolo T1: " + t1.toString());
         System.out.println("Perimetro triangolo T1: " + t1.perimetro());
         System.out.println("Area triangolo T1: " + t1.area());

         System.out.println("Triangolo T2: " + t2.toString());
         System.out.println("Perimetro triangolo T2: " + t2.perimetro());
         System.out.println("Area triangolo T2: " + t2.area());

         System.out.println("Triangolo T3: " + t3.toString());
         System.out.println("Perimetro triangolo T3: " + t3.perimetro());
         System.out.println("Area triangolo T3: " + t3.area());

         System.out.println("Triangolo T4: " + t4.toString());
         System.out.println("Perimetro triangolo T4: " + t4.perimetro());
         System.out.println("Area triangolo T4: " + t4.area());

         if(t1.equals(t4))
             System.out.println("I triangoli T1 e T4 sono uguali");
         else
             System.out.println("I triangoli T1 e T4 non sono uguali");
         if(t1.equivale(t4))
             System.out.println("I triangoli T1 e T4 sono equivalenti");
         else
             System.out.println("I triangoli T1 e T4 non sono equivalenti");
         if(t1.equals(t2))
             System.out.println("I triangoli T1 e T2 sono uguali");
         else
             System.out.println("I triangoli T1 e T2 non sono uguali");
         if(t1.equivale(t2))
             System.out.println("I triangoli T1 e T2 sono equivalenti");
         else
             System.out.println("I triangoli T1 e T2 non sono equivalenti");
     }
 }
