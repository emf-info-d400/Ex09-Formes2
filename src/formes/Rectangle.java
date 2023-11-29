package formes;

public class Rectangle {

    public Rectangle( double largeur, double hauteur ) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void sePresenter() {
        System.out.println( "Je suis un rectangle de largeur " + largeur + "[m] et de hauteur " + hauteur + "[m]" );
    }

    public double calculeSurface() {
        return largeur * hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    private final double largeur;
    private final double hauteur;
}
