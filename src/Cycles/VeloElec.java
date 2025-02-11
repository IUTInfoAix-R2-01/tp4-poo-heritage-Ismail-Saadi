// Classe dérivée VeloElec
package Cycles;

class VeloElec extends Velo {
    private static final double FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private double facteurPuissanceMoteur;

    // Constructeurs
    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec(double diamRoue, double coupleMoteur) {
        super(diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec() {
        super();
        this.facteurPuissanceMoteur = FACTEUR_PUISSANCE_MOTEUR;
    }

    // Getters et Setters
    public double getFacteurPuissanceMoteur() {
        return facteurPuissanceMoteur;
    }

    public void setFacteurPuissanceMoteur(double coupleMoteur) {
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    // Redéfinition de la méthode getPuissance
    @Override
    public double getPuissance(double frequenceCoupsDePedale) {
        return super.getPuissance(frequenceCoupsDePedale) * facteurPuissanceMoteur;
    }

    @Override
    public String toString() {
        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
    }
}