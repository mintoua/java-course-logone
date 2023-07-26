public class Main {
    public static void main(String[] args) {

        int y = 5;
        short shortY = 5;
        byte byteY = 1;

        char lettre_A = 'A' ;

        float moyenne = 18.6f; // 4octect
        double prix = 1000000.7895; // 8octects

        boolean etat = true;
        etat = false;

        System.out.println("intY" + " " + y);
        System.out.println("shortY " + shortY);
        System.out.println("byteY " + byteY);
        System.out.println("lettre_A " + lettre_A);
        System.out.println("moyenne " + moyenne);
        System.out.println("prix " + prix);
        System.out.println("etat " + etat);

        String salution = " Bonjour bienvenu chez ";
        String brand = "LOGONE";
        System.out.println( salution + " " + brand);

        //Les Opérations
        int a;
        int b;
        a = 5;
        b = 2;
        int sommeXY = a + b;
        int sustratXY = a - b;
        int multiplyXY = a * b;
        int divisionXY = a / b;


        System.out.println("la somme de x+y= " + sommeXY);
        System.out.println("la soustraction de x+y= " + sustratXY);
        System.out.println("la multiplication de x+y= " + multiplyXY);
        System.out.println("la division de x+y= " + divisionXY);

    }
}