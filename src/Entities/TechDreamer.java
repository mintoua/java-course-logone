package Entities;

public class TechDreamer implements Comparable<TechDreamer> {

    //Attributs
    private Integer id;
    private String nom,prenom;

    //Les deux constructeurs
    public TechDreamer() {
        this.id = 0;
        this.nom = "NomParDefaut";
        this.prenom = "PrenomParDefaut";
    }

    public TechDreamer(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    //Les getters et Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {

        if(obj == this){
            return true;
        }
        // pour tester si l'objet passer en param est null => si c'est null; je retourne false
        if( obj == null){
            return false;
        }

        if(this.getClass() != obj.getClass()) // instanceOf
        {
            return false;
        }

        final TechDreamer techDreamer = (TechDreamer) obj; //forçage de type => casting
        if ( this.id != techDreamer.id){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Entities.TechDreamer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int compareTo(TechDreamer o) {
        return this.id - o.id;
    }
}
