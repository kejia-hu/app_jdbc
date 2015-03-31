package control;

/**
 * 
 * @author Kejia HU
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import model.DAOMembre;
import model.RegistreMembre;
import utils.UtilDB;
import vue.GuiMembre;

public class AppCtr {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GuiMembre gui = new GuiMembre();
                gui.setVisible(true);
            }
        });
    }
}
