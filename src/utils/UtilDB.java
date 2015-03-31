package utils;

import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.*;

/**
 *
 * @author: Kejia HU
 */
public class UtilDB {

    private UtilDB() {
    }
     public static Connection getConnection(String nomFichierProp)
            throws IOException, ClassNotFoundException, SQLException {
        Properties props = new Properties();
        URL urlFichierProp = UtilDB.class.getResource(nomFichierProp);
        BufferedInputStream bis = null;
        try {
            //lecture du fichier de propriétés
            bis = new BufferedInputStream(urlFichierProp.openStream());
            props.load(bis);
            String driver = props.getProperty("driver");
            String url = props.getProperty("url");
            String identifiant = props.getProperty("identifiant");
            String motdepasse = props.getProperty("motdepasse");
            Class.forName(driver);
            //retourner le driver approprié
            return DriverManager.getConnection(url, identifiant, motdepasse);
        } finally {
            if (bis != null) {
                bis.close();
            }
        }
    }

    public static Connection getConnection(String nomFichierProp,
            String identifiant,
            String motdepasse)
            throws IOException, ClassNotFoundException, SQLException {
        Properties props = new Properties();
        URL urlFichierProp = UtilDB.class.getResource(nomFichierProp);
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(urlFichierProp.openStream());
            props.load(bis);
            String driver = props.getProperty("driver");
            String url = props.getProperty("url");
            Class.forName(driver);
            return DriverManager.getConnection(url, identifiant, motdepasse);
        } finally {
            if (bis != null) {
                bis.close();
            }
        }
    }
}
