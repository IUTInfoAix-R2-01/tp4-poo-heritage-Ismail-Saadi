package Cycles;
import java.util.Random;

// Classe Velo
public class Velo {
    private static final double DEFAULT_BRAQUET = 13.0;
    private double braquet;
    private double diamRoue;
    private Random genAlea;

    // Constructeurs
    public Velo(double braquet, double diamRoue) {
        this.braquet = braquet;
        this.diamRoue = diamRoue;
        this.genAlea = new Random();
    }

    public Velo(double diamRoue) {
        this(DEFAULT_BRAQUET, diamRoue);
    }

    public Velo() {
        this(DEFAULT_BRAQUET, 0.0);
    }

    // Getters et Setters
    public double getBraquet() {
        return braquet;
    }

    public void setBraquet(double braquet) {
        this.braquet = braquet;
    }

    public double getDiamRoue() {
        return diamRoue;
    }

    public void setDiamRoue(double diamRoue) {
        this.diamRoue = diamRoue;
    }

    public Random getGenAlea() {
        return genAlea;
    }

    public void setGenAlea(Random genAlea) {
        this.genAlea = genAlea;
    }

    // Méthode 
    public double getPuissance(double frequenceCoupsDePedale) {
        return frequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
    }

    @Override
    public String toString() {
        return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
    }
}


