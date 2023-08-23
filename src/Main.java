import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu chez LOGONE DIGITALE");
        System.out.println("Ceci est juste un projet sur la branche seance8 - Collections");

/*        String noms[] = new String[10];//taille
        noms[0] = "Mta";
        int[] notes = new int[10];*/

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

        System.out.println("************** First display******************");
        /// taille d'une collection ArrayList
        int tailleDeMaListe = etudiantList.size();

        /// Parcourir avec foreach
/*        for (Etudiant etudiant: etudiantList){
            etudiant.afficherInfos();
        }*/

        System.out.println("******* Second display after remove");

        ///retirer de la List
        etudiantList.remove(etudiant1);
        etudiantList.remove(1);
/*
        for (Etudiant etudiant: etudiantList){
            etudiant.afficherInfos();
        }
*/


        /// Interface Set
        /// Class HashSet
        Set<Etudiant> etudiantSet = new HashSet<>();
        etudiantSet.add(etudiant1);
        etudiantSet.add(etudiant2);
        for (Etudiant etudiant: etudiantSet){
            etudiant.afficherInfos();
        }


/*        ///Classe ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("Python");
        list.add("Pascal");
        System.out.println(list);

        ///Classe LinkedList
        LinkedList<String> lk = new LinkedList<String>();
        lk.add("Java");
        lk.add("PHP");
        lk.add("Python");
        lk.add("Pascal");
        System.out.println(lk);

        ///Interface Set
        Set <String> hashSet = new HashSet<String>();
        Set <String> linkedHashSet = new LinkedHashSet<String>();
        Set <String> treeSet = new TreeSet<String>();

        ///Classe HashSet
        HashSet<String> hash = new HashSet<>();
        hash.add("Java");
        hash.add("PHP");
        hash.add("Python");
        hash.add("Pascal");
        System.out.println(hash);

        ///Interface Map
        Map<String,String> myHashMap = new HashMap<>();
        Map<Integer,String> hashTableMap = new TreeMap<>();

        ///Classe HashMap / TreeMap (trie selon la valeur)
        HashMap<Integer,String> maMap = new HashMap<Integer, String>();
        maMap.put(1,"un");
        maMap.put(2,"deux");
        maMap.put(3,"trois");
        Set<Integer> cleSet = maMap.keySet();
        Collection<String> valeursSet = maMap.values();
        for (Map.Entry<Integer,String> element : maMap.entrySet())
        {
            System.out.println(element.getKey() + " : " + element.getValue());
        }*/

    }
}