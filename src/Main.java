import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu chez LOGONE DIGITALE");
        System.out.println("Ceci est juste un projet sur la branche seance8 - Collections");

/*
      String noms[] = new String[10]; //taille
        noms[0] = "Mta";
        int[] notes = new int[10];
*/

        ///Interface List
        /// Class ArrayList
        //List<String> maListString = new ArrayList<>();//capacity
        List<Etudiant> etudiantList = new ArrayList<>();

        Etudiant etudiant1 = new Etudiant("Mta","Tpkd","181JME5007");

        /// ajouter dans un ArrayList
        etudiantList.add(new Etudiant("NANKAP","Serge","181JME8965"));
        etudiantList.add(new Etudiant("Teughe","kelly","1815hmoe"));
        etudiantList.add(etudiant1);
        Etudiant etudiant2 = new Etudiant();
        etudiant2.setNom("Kongean");
        etudiant2.setPrenom("Theodore");
        etudiant2.setMatricule("78965JE");
        etudiantList.add(etudiant1);
        etudiantList.add(etudiant2);

     //   System.out.println("************** First display******************");
        /// taille d'une collection ArrayList
        int tailleDeMaListe = etudiantList.size();

        /// Parcourir avec foreach
        for (Etudiant currentEtudiant: etudiantList){
            currentEtudiant.afficherInfos();
        }

    //    System.out.println("******* Second display after remove");

        ///retirer de la List
        etudiantList.remove(etudiant1);
        etudiantList.remove(1);
        /// Parcourir avec foreach
        for (Etudiant etudiant: etudiantList){
            etudiant.afficherInfos();
        }

        /// Interface Set
        /// Class HashSet
        Set<Etudiant> etudiantSet = new HashSet<>();
        etudiantSet.add(etudiant1);
        etudiantSet.add(etudiant2);

/*        for (Etudiant etudiant: etudiantSet){
            etudiant.afficherInfos();
        }*/


        //Interface Map
        //Key => Value
        // 1 => "Un"
        // 2 => "Deux"
        // 3 => "Trois"
         // Etd1 => note[12,23,52]
        //  Etd2 => note[12,23,52]

        // créer une Map
        ///Classe HashMap
        Map<Integer,String> maMap = new HashMap<>();
        Map<String,String> strStr = new HashMap<>();
        Map<String,int[]> notes = new HashMap<>();

        int[] note1 = {12,13,14};
        int [] note2 = {15,18,8};
        notes.put("181JME50026",note1);
        notes.put("181JME4563",note2);

        ArrayList<Etudiant> listEtuds = new ArrayList<>();

        Map<String,Double> noteEtudiant1 = new HashMap<>();
        noteEtudiant1.put("Math",12.0);
        noteEtudiant1.put("Chimie",15.0);
        noteEtudiant1.put("SVT",11.0);
        noteEtudiant1.put("Physique",13.0);

        Map<String,Double> noteEtudiant2 = new HashMap<>();
        noteEtudiant2.put("Math",12.0);
        noteEtudiant2.put("Chimie",15.0);
        noteEtudiant2.put("SVT",11.0);
        noteEtudiant2.put("Physique",13.0);

        Map<Etudiant,Map> etudiantMapMap = new HashMap<>();
        etudiantMapMap.put(etudiant1,noteEtudiant1);
        etudiantMapMap.put(etudiant2,noteEtudiant2);


        Map<ArrayList,int[]> arrayListMap = new HashMap<>();
        arrayListMap.put(listEtuds,note1);
        // arrayListMap
        // Cle => Valeur

        // inserer dans une Map
        maMap.put(1,"Un");
        maMap.put(2,"Deux");
        maMap.put(3,"Trois");

        System.out.println(maMap.containsValue("Quatre"));

        // recuperer la set des cles d'une Map
        Set<Integer> mesCles = maMap.keySet();
        //recuperer la Collection de l'ens des valeurs
        Collection<String> mesValeurs = maMap.values();

        System.out.println(mesCles);
        System.out.println(mesValeurs);
        System.out.println(maMap.size());

        // retirer un element dans une Map
        maMap.remove(1);
        maMap.remove(2,"Deux");

        // parcourir une Map
        for (Map.Entry<Integer,String> element : maMap.entrySet())
        {
            System.out.println(element.getKey() + " : " + element.getValue());
        }


    }
}