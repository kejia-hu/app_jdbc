package model;

/**
 *
 * @author Kejia HU
 */
public class Membre {

    private int codeMembre;
    private String nom, prenom, adresse, statut;
    private double revenue_annuel;

    public Membre() {
    }

    public Membre(int codeMembre, String nom, String prenom) {
        this.codeMembre = codeMembre;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    

    public Membre(int codeMembre, String nom, String prenom, String adresse, String statut, double revenue_annuel) {
        this.codeMembre = codeMembre;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.statut = statut;
        this.revenue_annuel = revenue_annuel;
    }
    

    public int getCodeMembre() {
        return codeMembre;
    }

    public void setCodeMembre(int codeMembre) {
        this.codeMembre = codeMembre;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatu(String statut) {
        this.statut = statut;
    }

    public double getRevenue_annuel() {
        return revenue_annuel;
    }

    public void setRevenue_annuel(double revenue_annuel) {
        this.revenue_annuel = revenue_annuel;
    }

    @Override
    public String toString() {
        return "Membre{" + "codeMembre: " + codeMembre + ", nom: " + nom + ", prenom: " + prenom + '}';
        //return "Membre{" + "codeMembre: " + codeMembre + ", nom: " + nom + ", prenom: " + prenom + ", adresse=" + adresse + ", statut: " + statut + ", revenue_annuel: " + revenue_annuel + '}';
    }

}
