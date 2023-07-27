public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu(e) chez LOGONE DIGITALE");
        System.out.println("Vous êtes sur la branche seance 2");


// les opérations
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

/*        if ( age < 5 && age > 10){
            //
            // ]5;10[
        }*/

/*        if (age < 5  || age > 10){


        }*/

/*        boolean status = true; // !status => false

        if(!status){

        }*/
    }
}