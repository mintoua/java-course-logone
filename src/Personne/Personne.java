package Personne;

public class Personne implements IPersonne  {

    private String nom, prenom ,adresse;
    private int age;

    public Personne() {
        this.nom = "Dnom";
        this.prenom = "Dprenom";
        this.adresse = "Dadresse";
        this.age = 0;
    }

    public Personne(String nom, String prenom, String adresse, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void creerPersonne() {
        Personne newPersonne = new Personne("Mta","Tpkd","Tunis",40);
    }

    @Override
    public void afficherInfosPersonne() {

    }
}
