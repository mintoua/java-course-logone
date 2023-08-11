import java.util.Scanner;

public class Voiture {

    //Attributs
    String couleur;
    String marque;
    double prix;


    //Construteurs
    Voiture()
    {

    }

    Voiture(String color, String marq, double price)
    {
        this.couleur = color;
        this.marque = marq;
        this.prix = price;
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
