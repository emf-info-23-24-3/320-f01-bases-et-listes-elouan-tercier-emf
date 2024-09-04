package models;

public class Personne {
    private String prenom;
    private String nom;
    private String rueEtLocalite;
    private int npa;

    public Personne(String prenom, String nom, String rueEtLocalite, int npa) {
        this.prenom = prenom;
        this.nom = nom;
        this.rueEtLocalite = rueEtLocalite;
        this.npa = npa; 
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getRueEtLocalite() {
        return rueEtLocalite;
    }

    public int getNpa() {
        return npa;
    }

    
}
