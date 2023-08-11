import java.util.Scanner;

public class Voiture {

    //Attributs
    private String couleur;
    private String marque;
    private double prix;


    //Construteurs

    public Voiture() {
    }

    public Voiture(String couleur, String marque, double prix) {
        this.couleur = couleur;
        this.marque = marque;
        this.prix = prix;
    }
    //Getters & Setters


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    //Méthodes
    //syntaxe de création d'une méthode
    // type_de_retour nom_de_la_methode( paramètres ) { }
    // void
    String avancer(double vitesse){
        return "avance avec une vitessse" + vitesse;
    }

    void reculer()
    {
        System.out.println("reculer");
    }

}
