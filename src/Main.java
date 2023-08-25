import Services.LogoneArrayList;
import Entities.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu chez LOGONE DIGITALE");
        System.out.println("Ceci est juste un projet sur la branche TP-Interfaces-Collections");


        //Créer les "objets" TechDreamers
        TechDreamer techDreamer1 = new TechDreamer(1,"Abba","Ali");
        TechDreamer techDreamer2 = new TechDreamer(2,"Kongean","Theodore");
        TechDreamer techDreamer3 = new TechDreamer(3,"Nenkap","Serge");
        TechDreamer techDreamer4 = new TechDreamer(4,"Tpkd","Mta");

        //Créer la liste Services.LogoneArrayList
        LogoneArrayList logoneArrayList = new LogoneArrayList();

        //Ajout des TechDreamers dans la liste logoneArrayList
        logoneArrayList.ajouterTechDreamer(techDreamer1);
        logoneArrayList.ajouterTechDreamer(techDreamer2);
        logoneArrayList.ajouterTechDreamer(techDreamer3);

        System.out.println("***************************************");
        //Affichage les infos de la liste logoneArrayList
        logoneArrayList.afficherTechDreamers();
        System.out.println("***************************************");
        System.out.println("recherche de du techdreamer1: " + logoneArrayList.rechercherTechDreamer(techDreamer1));
        System.out.println("recherche de du techdreamer4: " + logoneArrayList.rechercherTechDreamer(techDreamer4));
        System.out.println("****************************************");
        System.out.println("recherche par nom: " + logoneArrayList.rechercherTechDreamer(techDreamer3.getNom()));

    }
}