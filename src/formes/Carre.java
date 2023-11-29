package formes;

public class Carre {

    public Carre( double cote ) {
        this.cote = cote;
    }

    public void sePresenter() {
        System.out.println( "Je suis un carré de côté " + cote + "[m]" );
    }

    public double calculeSurface() {
        return cote * cote;
    }

    public double getCote() {
        return cote;
    }

    private final double cote;
}
