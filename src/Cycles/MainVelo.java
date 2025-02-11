package Cycles;+

public class MainVelo {
    public static void main(String[] args) {
        // Création d'un vélo 
        Velo velo = new Velo(14.0, 27.5);
        System.out.println(velo);
        System.out.println("Puissance du vélo : " + velo.getPuissance(80));

        // Création d'un vélo élec
        VeloElec veloElec = new VeloElec(14.0, 27.5, 20.0);
        System.out.println(veloElec);
        System.out.println("Puissance du vélo électrique : " + veloElec.getPuissance(80));
    }
}
