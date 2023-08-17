package Compte;

public class CompteBancaire
//Class Mère
{
    //Les attributs
    protected String numeroCompte, titulaire;
    protected double solde;


    //Constructeurs
    //constructeur non-paramétré
    public CompteBancaire()
    {
        this.numeroCompte = "0000000";
        this.titulaire = "XXXXXXX";
        this.solde = 0;
    }

    //constructeur paramétré
    public CompteBancaire(String numeroCompte,
                          String titulaire,
                          double solde)
    {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant){
        this.solde += montant;
        System.out.println("Dépôt de " + montant + "effectué.");
        System.out.println("Nouveau solde : " + this.solde);
    }

    public void deposer(String nomTitu,
                        String numeroCompte,
                        double montant){

    }



    public void retirer(double montant){
        if(montant <= this.solde){
            this.solde -= montant;
            System.out.println("Retrait de " + montant + " effectué.");
            System.out.println("Nouveau solde : " + this.solde);
        }
        else {
            System.out.println("Solde insuffissant pour le retrait !!!");
        }
    }

    public void afficherInfos(){
        System.out.println("Numéro de compte : " + numeroCompte);
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Solde : " + solde);
    }

//Recupérer = Getters et Setters = Modificateurs
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
