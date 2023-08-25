package Services;

import Entities.TechDreamer;
import Interfaces.CentreFormation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogoneArrayList implements CentreFormation {

    private List<TechDreamer> listeDesTechDreamers;

    public LogoneArrayList(){
        this.listeDesTechDreamers = new ArrayList<>();
    }

    @Override
    public void ajouterTechDreamer(TechDreamer techDreamer) {
        listeDesTechDreamers.add(techDreamer);
    }

    @Override
    public void supprimerTechDreamer(TechDreamer dreamer) {
        listeDesTechDreamers.remove(dreamer);
    }

    @Override
    public void afficherTechDreamers()
    {
        for (TechDreamer currentTech : listeDesTechDreamers)
        {
            System.out.println(currentTech.toString());
        }
        //listeDesTechDreamers.forEach(techDreamer -> {System.out.println(techDreamer.toString());});
    }


    @Override
    public boolean rechercherTechDreamer(TechDreamer techDreamer) {

        if(listeDesTechDreamers.contains(techDreamer)){
            System.out.println("Le TechDreamer: " + techDreamer.toString() + " existe !");
            return true;
        }

        System.out.println("Le TechDreamer: " + techDreamer.toString() + " n'existe pas!");
        return false;
    }

    @Override
    public boolean rechercherTechDreamer(String nom) {
        for (TechDreamer techDreamer : listeDesTechDreamers){
            if(techDreamer.getNom().equals(nom)) {
                System.out.println("Le TechDreamer: " + techDreamer.getNom() + " existe !");
                return true;}
        }

        System.out.println("N'existe pas !!!");
        return false;
    }

    @Override
    public void trierTechDreamersParId() {
        Collections.sort(listeDesTechDreamers);
    }

}
