public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu(e) chez LOGONE DIGITALE");
        System.out.println("Vous êtes sur la branche seance 2");


/*// les opérations
        //incrémentation et décrementation
        int score = 0;
        int vie = 5;
        vie--;
        //--vie;
        score++;  // score = score + 1;
       // ++score; // score = 1 + score ;
        System.out.println("score= " + score);
        System.out.println("vie= " + vie);

        //les opérateurs d'affectations
        int a,b;
        a = 10;
        a =+ 3; // a = a + 3;
        b = a; // b = 10;

        int a1 = 10;
        int a2 = 13;


        //les opérateurs de comparaisons
        //égale ==, sup >, ing <, infegal <=, supegal >=, diff !=

        int age = 9;
        boolean rsltCom;
        rsltCom = age != 10; // true, false 11
        System.out.println(rsltCom);


//        //les opérateurs logiques
        // ET ( && ), OU ( || ), NON ( ! ]

        boolean rsltlog;
        rsltlog = age < 10 && age > 5;

        System.out.println(rsltlog);

*//*        if ( age < 5 && age > 10){
            //
            // ]5;10[
        }*//*

*//*        if (age < 5  || age > 10){


        }*//*

*//*        boolean status = true; // !status => false

        if(!status){

        }*/

/*         //Les tableaux
        String nom;
        int [] tabEntier;
        String [] noms;
        float [] prixProduits;
        double [] notesEleves;

        double [] notes = new double[100];
        notes[0] = 12;
        notes[1] = 18.4;
        notes[2] = 15;
        notes[3] = 10;

        String[] nomsStg = {"Abba", "Theodore", "Serge", "Aurelle", "Kelly", "Mintoua"};

        System.out.println(notes[0]);
        System.out.println(notes[1]);
        System.out.println(notes[2]);
        System.out.println(notes[3]);

        System.out.println(nomsStg[0]);
        System.out.println(nomsStg[1]);
        System.out.println(nomsStg[2]);
        System.out.println(nomsStg[3]);
        System.out.println(nomsStg[4]);
        System.out.println(nomsStg[5]);*/


        // Exemple d'application
        double [] notes = {12.5, 15.0, 18.5, 13.7, 16.2};

        //calculer la somme des notes
        double somme1 = 0;
        double somme2 = 0;


        //boucle for et foreach en JAVA
        for (int i=0; i<5; i++ ){
            somme1 = somme1 + notes[i];
        }

        for (double note:  notes){
            somme2 += note; // somme = somme + note;
        }

        double moyenne1 = somme1 / notes.length;
        double moyenne2 = somme2 / 5;

        System.out.println("somme1 " + somme1);
        System.out.println("somme2 " + somme2);

        System.out.println("moyenne1 " + moyenne1);
        System.out.println("moyenne2 " + moyenne2);


        //prochaine seance structure conditionnelles et itératives --> seance_3

    }
}