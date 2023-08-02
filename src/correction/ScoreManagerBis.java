package correction;

import java.util.Scanner;

public class ScoreManagerBis {
    // Déclaration des tableaux pour stocker les noms et scores des joueurs
    static String[] nomsJoueurs = new String[10];
    static int[] scoresJoueurs = new int[10];
    static int nombreJoueurs = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int choix;

        //Menu de l'application

        do{
            System.out.println("\n===== GESTIONNAIRE DE SCORES =====");
            System.out.println("1. Ajouter un joueur et son score");
            System.out.println("2. Afficher les meilleurs scores");
            System.out.println("3. Afficher le score moyen");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    ajouterJr(scanner);
                    break;
                case 2:
                    afficherMeilleurScores();
                    break;
                case 3:
                    afficherMoyenneScore();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }while (choix != 4);
    }
    private static void ajouterJr(Scanner scanner) {
        if (nombreJoueurs >= 10) {
            System.out.println("Nombre maximum de joueurs atteint. Impossible d'ajouter un nouveau joueur.");
            return;
        }

        System.out.print("Entrez le nom du joueur : ");
        String nomJr = scanner.nextLine();

        int score;
        do {
            System.out.print("Entrez le score du joueur (doit être un nombre positif) : ");
            score = scanner.nextInt();
            scanner.nextLine();
        } while (score < 0);

        nomsJoueurs[nombreJoueurs] = nomJr;
        scoresJoueurs[nombreJoueurs] = score;
        nombreJoueurs++;

        System.out.println("Joueur ajouté avec succès !");
    }

    private static void afficherMeilleurScores() {
        System.out.println("\nMeilleurs scores :");
        int nombreMeilleursScores = Math.min(nombreJoueurs, 5);
        for (int i = 0; i < nombreMeilleursScores; i++) {
            System.out.println(nomsJoueurs[i] + " - " + scoresJoueurs[i]);
        }

    }
    private static void afficherMoyenneScore() {
        if (nombreJoueurs == 0) {
            System.out.println("Aucun joueur enregistré. Le score moyen est de 0.");
            return;
        }

        int sommeScores = 0;
        for (int i = 0; i < nombreJoueurs; i++) {
            sommeScores += scoresJoueurs[i];
        }
        double scoreMoyen = (double) sommeScores / nombreJoueurs;
        System.out.println("\nScore moyen de tous les joueurs : " + scoreMoyen);
    }




}
