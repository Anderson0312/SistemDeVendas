package classes;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author AndersoNMN
 */
public class Dados_DB {
    private Connection cnn;
    
    //classe que acessa o banco de dados
    public Dados_DB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //local onde seu banco de dados se encontra
            String db = "jdbc:mysql://localhost:3306/sistemafaturacao";
            cnn = (Connection) DriverManager.getConnection(db,"root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean validarUsuario(String usuario, String senha){
       
        try {
            String sql = "select (1) from usuarios where idUsuario = '"
                +usuario+"'and senha = '"+senha+"'";
            Statement st;
            st = cnn.createStatement();
            //executa a pesquisa no banco de dados
            ResultSet rs = st.executeQuery(sql);
            // se o resultado da query for igual a 1 significa que o usuario existe
            if(rs.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    public int getPerfil(String usuario){
        
        try {
            String sql = "select idPerfil from usuarios where idUsuario = '"
                    +usuario+"'";
                        Statement st;
            st = cnn.createStatement();
            //executa a pesquisa no banco de dados
            ResultSet rs = st.executeQuery(sql);
            // se o resultado da query for igual a 1 significa que o usuario existe
            if(rs.next()){
                return rs.getInt("idPerfil");
            } else {
                return -1;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
        
        
}
