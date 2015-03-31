package model;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.UtilDB;

/**
 *
 * @author 1495636
 */
public class DAOMembre {
    
    Statement stmt = null;
    Connection connexion = null;
    String fichierConnexion;
    
    public DAOMembre(String fichierConnexion) {
        this.fichierConnexion = fichierConnexion;
    }
    
    public void openConnexion() {
        try {
            connexion = UtilDB.getConnection(fichierConnexion);
            stmt = connexion.createStatement();
        } catch (IOException ex) {
            Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fermerConnexion() {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (connexion != null) {
            try {
                connexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ResultSet executerRequete(String requete) {
        openConnexion();
        ResultSet rset = null;
        try {
            rset = stmt.executeQuery(requete);
        } catch (SQLException ex) {
            Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }

    public int executerCommande(String commande) {
        openConnexion();
        int rows = 0;
        try {
            rows = stmt.executeUpdate(commande);
        } catch (SQLException ex) {
            Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rows;
    }
    
    public static void resultSetToList(ResultSet rset, RegistreMembre list) {
        try {
            //parcours
            //System.out.println("parcours du resultset");
            while (rset.next()) {
                Membre mem = new Membre(rset.getInt(1), rset.getString(2), rset.getString(3));
                list.add(mem);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMembre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
