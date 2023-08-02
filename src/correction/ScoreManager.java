package correction;

import java.util.Scanner;

public class ScoreManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration des tableaux pour stocker les noms et scores des joueurs
        String[] nomsJoueurs = new String[10];
        int[] scoresJoueurs = new int[10];
        int nombreJoueurs = 0;

        // Saisie des données des joueurs
        //String choix;
        int choix;
        do {
            System.out.print("Entrez le nom du joueur : ");
            String nom = scanner.nextLine();
            System.out.print("Entrez le score du joueur : ");
            int score = scanner.nextInt();
            scanner.nextLine();

            // Valider le score pour qu'il soit positif
            if (score >= 0) {
                // Ajouter le nom et le score du joueur aux tableaux
                nomsJoueurs[nombreJoueurs] = nom;
                scoresJoueurs[nombreJoueurs] = score;
                nombreJoueurs++;

                System.out.print("Voulez-vous ajouter un autre joueur ? (1-oui/2-non) : ");
                //choix = scanner.nextLine();
                choix = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Le score doit être un nombre positif !");
                choix = 1; // Pour continuer la boucle et permettre une nouvelle saisie
            }
        } while (choix != 2);

        // Affichage des meilleurs scores
        System.out.println("\nMeilleurs scores :");
        int nombreMeilleursScores = Math.min(nombreJoueurs, 5);
        for (int i = 0; i < nombreMeilleursScores; i++) {
            System.out.println(nomsJoueurs[i] + " - " + scoresJoueurs[i]);
        }

        // Calcul et affichage du score moyen
        int sommeScores = 0;
        for (int i = 0; i < nombreJoueurs; i++) {
            sommeScores += scoresJoueurs[i];
        }
        double scoreMoyen = (double) sommeScores / nombreJoueurs;
        System.out.println("\nScore moyen de tous les joueurs : " + scoreMoyen);
    }
}
