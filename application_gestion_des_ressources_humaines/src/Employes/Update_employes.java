
package Employes;

import java.beans.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Update_employes  {
    private  int id_employes;
    private String Mdp_employes;
    public void update_mdp(int id_e,String Mdp_emp)
    {
        try {
            id_employes=id_e;
            Mdp_employes=Mdp_emp;
            String Query="update   employer set Passwrd_emp  ='"+Mdp_emp+"' WHERE Cin_emp ="+id_e+"";
            Mes_outils.con=Connexion.connecterDB();
            Mes_outils.stm=Mes_outils.con.createStatement();
            Mes_outils.stm.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Modification avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(Update_employes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void modifier_information_menu(){
          Demande_conges d= new Demande_conges();
      d.show();
    }
}
