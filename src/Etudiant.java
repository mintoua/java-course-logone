public class Etudiant {

    private String nom, prenom, matricule;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void afficherInfos(){
        System.out.println("*****************");
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Matricule: " + matricule);
        System.out.println("*****************");
    }
/*    @Override
    public String toString() {
        return "Etudiant{" + "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", matricule='" + matricule + '\'' + '}';
    }*/
}
