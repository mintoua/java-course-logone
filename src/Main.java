public class Main {
    public static void main(String[] args)
    {
        System.out.println("Bienvenu chez LOGONE DIGITALE");
        System.out.println("Ceci est juste un projet sur la branche seance_5");
        //Instances de la classe Voiture
 /*       Voiture voiture1 = new Voiture();
        Voiture voiture2 = new Voiture("blue","mercedez",50000);*/
        Utilisateur user1 = new Utilisateur();
        Utilisateur user2 = new Utilisateur("mta", "tpkd", "mta@gmail.com", 45);
        Utilisateur user3 = new Utilisateur("nankap", "serge");

        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture("rouge", "toyota", 20000);
        v2.avancer(20);
        v2.reculer();


        //Correction TP
        // Créer des objets Personne
        Personne personne1 = new Personne("Alice", 25, "123 Rue A");
        Personne personne2 = new Personne("Bob", 30, "456 Rue B");

        // Appeler les méthodes pour afficher les informations et dire bonjour
        personne1.afficherInfo();
        personne1.direBonjour();

        System.out.println();  // Ligne vide

        personne2.afficherInfo();
        personne2.direBonjour();
    }
}