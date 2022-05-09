
package Employes;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class type_conges extends JFrame {
    private int id_type_conges;
    private String type_conges;
   
    public static void  Type_conges(JComboBox  type_conge_j){
        try 
            {
                Mes_outils.con=Connexion.connecterDB();
                Mes_outils.stm=Mes_outils.con.createStatement();
                Mes_outils.rs=Mes_outils.stm.executeQuery("SELECT * FROM type_conges");
                while(Mes_outils.rs.next())
                {
                   type_conge_j.addItem(Mes_outils.rs.getString("id_conge"));
                   
          
                }
            }  
            catch (SQLException e) 
            {
                System.err.println(e.toString());
            }
    }
    public static void conges_menu(){
        Demande_conges d= new Demande_conges();
        d.show();
    }
}
