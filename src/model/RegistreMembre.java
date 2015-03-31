package model;

/**
 *
 * @author Kejia HU
 */
import java.util.ArrayList;

public class RegistreMembre extends ArrayList<Membre> {

    private ArrayList<Membre> liste;
    
    public RegistreMembre(ArrayList<Membre> liste) {
        this.liste = liste;
    }
    
    public void ajouterMembre(Membre mem) {
        liste.add(mem);
    }
    
    public ArrayList<Membre> getListe() {
        return liste;
    }

    public void afficherMembre() {
        int count = 0;
        System.out.println("Membres dans la liste");
        for (Membre mem : this) {
            //System.out.println("Membre:" + count++);
            System.out.println(mem);
        }
    }
}
