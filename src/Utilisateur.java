import jdk.jshell.execution.Util;

public class Utilisateur {

    //Attributs
    String nom, prenom, email;
    int age;
    Utilisateur(){
        this.nom = "John";
        this.prenom =  "Doe";
        this.email = "johndoe@.gmail";
        this.age = 0;
    }

    Utilisateur (
            String name,
            String surname){
        this.nom = name;
        this.prenom = surname;
        this.email = "";
        this.age = 0;
    }

    Utilisateur (String name,
                 String surname,
                 String mail,
                 int age){
        this.nom = name;
        this.prenom = surname;
        this.email = mail;
        this.age = age;
    }

    ///methodes
    void creeUnCompte(){

        //codes
        //return null;
    }


}
