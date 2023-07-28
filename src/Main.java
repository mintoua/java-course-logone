import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu chez LOGONE DIGITALE");
        System.out.println("Séance 3");

        //Structure conditionnneles et itératives
        //if, if..else, if..else..if, switch..case
        var value = Math.random()*10;

        System.out.println(value);
/*        if(value>5){
            System.out.println("valeur sup à 5");
        }

        int [] nombres= {26,14,75,12};

        int max = nombres[0];
        for (int i=1; i< nombres.length; i++){
            if(nombres[i] > max){
                max = nombres[i];
            }
        }

        int maxi = 0;
        for (int i=0; i< nombres.length; i++){
            if(maxi > nombres[i]){
                maxi = maxi;
            }
            else if (nombres[i] > maxi)
                {
                maxi = nombres[i];
            }
                else {
                    System.out.println("maxi");
                }
        }*/

/*        //structures ternaire
        int a=12,b=10;
        int val;
        if(a>b)
        {
            val = a;
        }else {
            val = b;
        }

        int valeur = a>b ? a : b;



        //switch .. case => selon .. cas


        int choix = 0;

        do {
                    *//*
        1 - jouer solo
        2 - jouer à deux
        3- param
        0- quiter
        choix:
         *//*
            switch (choix){
                case 1:
                    System.out.println("jouer solo");
                    break;
                case 2:
                    System.out.println("jouer à deux");
                    break;
                case 3:
                    System.out.println("aff param");
                    break;
                case 0:
                    System.out.println("goodbye");
                    break;
                default:
                    System.out.println("veuillez faire votre choix");
                    break;
            }
        }while (choix != 0);


        //while (tantque), do .. while (faire .. tant que)
        do{

        }while(true);*/

/*        int i = 1;

        while (i <= 10){
            System.out.println(i);
            i++;
        }
        */
        // Saisir une valeur avec Scanner

/*        Scanner scanner = new Scanner(System.in);

        int nombre;

        do{
            System.out.println("entrez un nombre positif : ");
            nombre =  scanner.nextInt();
        }while (nombre <= 0);
        */
        //for et foreach

        String[] noms = {"Theodore", "Kelly", "Serge", "Mintoua"}; //4
        for ( int i = 0 ; i < noms.length ; i++)
        {
            System.out.println( noms[i] );
        }
        System.out.println("*********************");
        for(String nom : noms){
            System.out.println(nom);
        }


    }
}