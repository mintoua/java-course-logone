import Compte.CompteBancaire;
import Compte.CompteEpargne;

import java.util.Scanner;

public class GestionnaireComptes {
    public static void main(String[] args) {

        CompteBancaire compteBancaire = new CompteBancaire(
                "001BN",
                "Mta",
                1000000
        );
        CompteBancaire compteBancaireDefault = new CompteBancaire();
/*        System.out.println(compteBancaireDefault.toString());
        compteBancaireDefault.setNumeroCompte("002BN");
        compteBancaireDefault.setSolde(2000000);
        compteBancaireDefault.setTitulaire("Abba");
        System.out.println("***************");
        System.out.println(compteBancaireDefault.toString());*/


/*      String nomDuTitulaire = compteBancaire.getTitulaire();
        System.out.println( " Félicitation " + nomDuTitulaire);
        Scanner scan = new Scanner(System.in);

        System.out.println("Nouveau nom: ");
        String nouveauNom = scan.nextLine();
        compteBancaire.setTitulaire(nouveauNom);
        System.out.println( " Félicitation " + compteBancaire.getTitulaire());*/

        CompteEpargne compteEpargne = new CompteEpargne(
                "001CE",
                "Serge",
                5000000,
                0.2
        );

        compteBancaire.deposer(100000);
        compteEpargne.deposer(5000);
        System.out.println("*************infos avant retrait****************");
        compteBancaire.afficherInfos();
        System.out.println("**\n");
        compteEpargne.afficherInfos();


        compteBancaire.retirer(1500000);
        compteEpargne.retirer(50000);
        System.out.println("*************infos après retrait****************");
        compteBancaire.afficherInfos();
        System.out.println("**\n");
        compteEpargne.afficherInfos();
    }
}
