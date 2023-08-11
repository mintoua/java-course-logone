package Utilisateur;

import jdk.jshell.execution.Util;

public class Utilisateur {

    //Attributs
    protected String nom, prenom, email;
    protected int age;

    public Utilisateur(){
        this.nom = "John";
        this.prenom =  "Doe";
        this.email = "johndoe@.gmail";
        this.age = 0;
    }

    public Utilisateur (
            String name,
            String surname){
        this.nom = name;
        this.prenom = surname;
        this.email = "";
        this.age = 0;
    }

    public Utilisateur (String name,
                 String surname,
                 String mail,
                 int age){
        this.nom = name;
        this.prenom = surname;
        this.email = mail;
        this.age = age;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    ///methodes
    public void creeUnCompte(){

        //codes
        //return null;
    }


}
