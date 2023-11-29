package formes;

public class Triangle {

    public Triangle( double base, double hauteur ) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public void sePresenter() {
        System.out.println( "Je suis un triangle de base " + base + "[m] et de hauteur " + hauteur + "[m]" );
    }

    public double calculeSurface() {
        return base * hauteur / 2;
    }

    public double getBase() {
        return base;
    }

    public double getHauteur() {
        return hauteur;
    }

    private final double base;
    private final double hauteur;
}
