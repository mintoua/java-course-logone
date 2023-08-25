package Interfaces;
import Entities.*;

public interface CentreFormation {
    public void ajouterTechDreamer(TechDreamer techDreamer);
    public boolean rechercherTechDreamer( TechDreamer e);
    public boolean rechercherTechDreamer( String nom);
    public void supprimerTechDreamer(TechDreamer dreamer);
    public void afficherTechDreamers();
    public void trierTechDreamersParId();
}
