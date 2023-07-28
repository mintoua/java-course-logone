public class Voiture {

    // les Attributs
    String marque;
    String model;
    double prix;
    double vitesse;
    String couleur;

    // Constructeurs
    Voiture() {

    }

    Voiture( String marqueParam, String modelParam, String couleurParam) {
        this.marque = marqueParam;
        this.model = modelParam;
        this.couleur = couleurParam;
    }

    Voiture (double prixP, double vitesseP){
        this.prix = prixP;
        this.vitesse = vitesseP;
    }


    //Les Méthodes

    void demarrer()
    {
        System.out.println("La voiture démarre.");

    }

    void accelerer(double augmentation){
        vitesse += augmentation; // vitesse = vitesses + augmention;
        System.out.println(" La voiture accélère à " + vitesse + " km/h.");
    }


    int arreter(){
        vitesse = 0;
        System.out.println("La voiture s'arrête");

        return 0;
    }

/*    type_de_retour nom_de_la_méthode ( parametres )
    {
        //corps de la fonction

        return ;
    }*/

}
