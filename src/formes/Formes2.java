package formes;
public class Formes2 {
    public final static int TAILLE_TABLEAU_OBJETS = 10;
    public static void main( String[] args ) {
        // Création de nos diverses formes
        Triangle t1 = new Triangle( 4, 3 );
        Triangle t2 = new Triangle( 2, 2 );
        Carre c1 = new Carre( 5 );
        Carre c2 = new Carre( 3 );
        Rectangle r1 = new Rectangle( 4, 3 );
        Rectangle r2 = new Rectangle( 2, 2 );
        Disque d1 = new Disque( 5 );
        Disque d2 = new Disque( 3 );

        // On les mets dans un tableau d'objets (rappel : en Java tout objet créé est également un Object)
        Forme[] mesFormes = new Forme[ TAILLE_TABLEAU_OBJETS ];
        mesFormes[0] = t1;
        mesFormes[1] = c1;
        mesFormes[2] = r2;
        mesFormes[3] = d2;
        mesFormes[4] = d1;
        mesFormes[5] = t2;
        mesFormes[8] = c2;
        mesFormes[9] = r2;

        // Cool, on ne peut plus y mettre de String puisque ce n'est pas une "Forme"
//        mesFormes[6] = "Coucou je suis une chaîne de caractères";

        // On se promène dans le tableau et, selon avec qui on a à faire, on affiche qui c'est et sa surface
        for ( int i = 0; i < mesFormes.length; i++ ) {
            // Mettre la main sur l'objet à cet endroit-là
            Forme maForme = mesFormes[i];
            // Y en a-t-il un ?
            if ( maForme != null ) {
                // Pas besoin de connaître "à qui avons-nous à faire" vu qu'au minimum c'est une forme
                maForme.sePresenter();
                System.out.println( "Ma surface est de " + maForme.calculeSurface() + "[m^2]" );
                System.out.println( "-----------------------" );
            }
        }
    }