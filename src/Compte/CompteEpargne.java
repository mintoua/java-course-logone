package Compte;

public class CompteEpargne extends CompteBancaire
//Class fille CompteEpargne qui hérite de la class mère CompteBancaire
{

    //attributs
    private double tauxInteret;

    //constructeurs


    public CompteEpargne() {
        this.tauxInteret = 0;
    }

    public CompteEpargne(String numeroCompte,
                         String titulaire,
                         double solde,
                         double tauxInteret)
    {
        super(numeroCompte, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }


    //méthodes

    //La rédinition d'une méthode de la classe mère est le polymorphisme Par héritage
    @Override //annotation qui permet à JAVA de redéfinir
    public void deposer(double montant){
        super.deposer(montant);
        this.solde += montant * this.tauxInteret;
        System.out.println("Intérêt ajouté, nouveau solde : " + solde);
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}
