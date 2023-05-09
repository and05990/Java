package Calciatori;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Calciatore> calciatori = new ArrayList<>();

        Calciatore calciatore1 = new Calciatore("Cristiano", "Ronaldo", 7, "Attaccante", 1000000);
        Calciatore calciatore2 = new Calciatore("Gianluigi", "Buffon", 1, "Portiere", 0);
        Calciatore calciatore3 = new Calciatore("Leonardo", "Bonucci", 19, "Difensore", 0);
        Calciatore calciatore4 = new Calciatore("Paulo", "Dybala", 10, "Centrocampista", 6);
        Calciatore calciatore5 = new Calciatore("Federico", "Chiesa", 22, "Attaccante", 1);
        Calciatore calciatore6 = new Calciatore("Juan", "Cuadrado", 16, "Centrocampista", 8);
        Calciatore calciatore7 = new Calciatore("Giorgio", "Chiellini", 3, "Difensore", 0);
        Calciatore calciatore8 = new Calciatore("Matthijs", "De Ligt", 4, "Difensore", 0);
        Calciatore calciatore9 = new Calciatore("Aaron", "Ramsey", 8, "Centrocampista", 0);
        Calciatore calciatore10 = new Calciatore("Adrien", "Rabiot", 25, "Centrocampista", 5);
        Calciatore calciatore11 = new Calciatore("Alex", "Sandro", 12, "Difensore", 0);

        
        calciatori.add(calciatore1);
        calciatori.add(calciatore2);
        calciatori.add(calciatore3);
        calciatori.add(calciatore4);
        calciatori.add(calciatore5);
        calciatori.add(calciatore6);
        calciatori.add(calciatore7);
        calciatori.add(calciatore8);
        calciatori.add(calciatore9);
        calciatori.add(calciatore10);
        calciatori.add(calciatore11);

        
        int sumAttaccante = 0;
        int sumPortiere = 0;
        int sumDifensore = 0;
        int sumCentrocampista = 0;
        int sumGoal = 0;
        for(Calciatore calciatore : calciatori){
            if(calciatore.getRuolo().equals("Attaccante")){
                sumAttaccante += calciatore.getGoal();
            }
            if(calciatore.getRuolo().equals("Portiere")){
                sumPortiere += calciatore.getGoal();
            }
            if(calciatore.getRuolo().equals("Difensore")){
                sumDifensore += calciatore.getGoal();
            }
            if(calciatore.getRuolo().equals("Centrocampista")){
                sumCentrocampista += calciatore.getGoal();
            }
            sumGoal += calciatore.getGoal();
        }

        System.out.println("Goal attaccanti: " + sumAttaccante);
        System.out.println("Goal portieri: " + sumPortiere);
        System.out.println("Goal Difensori: " + sumDifensore);
        System.out.println("Goal centrocampisti: " + sumCentrocampista);
        System.out.println("Goal totali: " + sumGoal);
    }
}
