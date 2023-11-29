package formes;

public class Disque {

    public Disque( double rayon ) {
        this.rayon = rayon;
    }

    public void sePresenter() {
        System.out.println( "Je suis un disque de rayon " + rayon + "[m]" );
    }

    public double calculeSurface() {
        return rayon * rayon * Math.PI;
    }

    public double getRayon() {
        return rayon;
    }

    private final double rayon;
}
