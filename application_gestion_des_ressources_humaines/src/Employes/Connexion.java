package Employes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connexion {
    private final static String  url ="jdbc:mysql://localhost:3306/";
    private  final  static String nom_bd="d-sgrh";
    private final static String root="root";
    private  final static String mot_de_passe="";
    public static String  chemin_db(){
        return url+nom_bd;
    }
    
    public static Connection connecterDB(){
        Connection con=null;
        
        try {
              con=DriverManager.getConnection(chemin_db(), root,mot_de_passe);
                    
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return con;
    }
}
