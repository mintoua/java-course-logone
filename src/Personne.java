public class Personne {
    // Attributs
    String nom;
    int age;
    String adresse;

    // Constructeurs
    Personne(){

    }
     Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    // Méthode pour afficher les informations
     void afficherInfo() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Adresse : " + adresse);
    }

    // Méthode pour dire bonjour
     void direBonjour() {
        System.out.println("Bonjour, je m'appelle " + nom);
    }
}