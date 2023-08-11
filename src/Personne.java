public class Personne {
    // Attributs
    private String nom;
    private int age;
    private String adresse;

    // Constructeurs
    Personne(){
        this.nom = "default name";
        this.age = 0;
        this.adresse = "default adresse";
    }
     Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    //Accesseurs = Getters
    public String getNom() {
        return nom;
    }

    public int getAge() {

        return age;
    }

    public String getAdresse() {

        return adresse;
    }

    //Modificateurs == Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }




    // Méthode pour afficher les informations
    public void afficherInfo() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Adresse : " + adresse);
    }

    // Méthode pour dire bonjour
    public void direBonjour() {
        afficherInfo();
        System.out.println("Bonjour, je m'appelle " + nom);
    }

}