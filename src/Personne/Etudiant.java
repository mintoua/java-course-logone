package Personne;

public class Etudiant extends Personne implements IPersonne{

    private String classe, matricule;

    @Override
    public void creerPersonne() {
        Etudiant newPersonne = new Etudiant();
    }

    @Override
    public void afficherInfosPersonne() {

    }
}
