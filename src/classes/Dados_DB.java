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
    
    
    
    //////////////////////////USUARIO/////////////////////////////
    
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
    
    public boolean existeUsuario(String usuario){
        try {
            String sql = "select (1) from usuarios where idUsuario = '"
                    +usuario+"'";
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
    
        
    
        public String adicionarUsuario(Usuario mUsuario) {
            try {
            String sql = "insert into usuarios values ('"
                    +mUsuario.getIdUsuario()+"','"
                    +mUsuario.getNome()+"','"
                    +mUsuario.getSobreNome()+"','"
                    +mUsuario.getSenha()+"',"
                    +mUsuario.getPerfil()+")";
            Statement st;
            st = cnn.createStatement();
            //executa o Update no banco de dados
            st.executeUpdate(sql);
            return "Usuario cadastrado com sucesso!";
            
                        
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possivel cadastrar";
        }
        }
        
        
        public String editarUsuario(Usuario mUsuario) {
            try {
            String sql = "update usuarios set "
                    +"nomes = '"+mUsuario.getNome()+"', "
                    +"sobreNome = '"+mUsuario.getSobreNome()+"', "
                    +"senha = '"+mUsuario.getSenha()+"', "
                    +"perfil "
                    + "where idUsuario = '"+mUsuario.getIdUsuario()+"'";
            Statement st;
            st = cnn.createStatement();
            //executa a Update no banco de dados
            st.executeUpdate(sql);
            return "Usuario Editado com sucesso!";
            
                        
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possivel Editado";
        }
        }
        
        
        public String deletarUsuario(String usuario) {
            try {
                String sql = "delete from usuarios where idUsuario = '"+usuario+"'";
            Statement st;
            st = cnn.createStatement();
            //executa a Update no banco de dados
            st.executeUpdate(sql);
            return "Usuario Deletado com sucesso!";
            
                        
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possivel Deletado";
        }
        }
        
        
        public ResultSet getUsuarios(){
            try {
                    String sql = "SELECT * FROM usuarios";
                Statement st = cnn.createStatement();
                //executa a Update no banco de dados
                return st.executeQuery(sql);

            } catch (SQLException ex) {
                Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        
    public int numeroUsuarios(){
        try {
                String sql = "SELECT count (*) as num FROM usuarios";
                Statement st;
                st = cnn.createStatement();
                //executa a Update no banco de dados
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return rs.getInt("num");
                } else{
                    return 0;
                }

            } catch (SQLException ex) {
                Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
    }
    
    
    //////////////////////PRODUTOS/////////////////////////////
    
        public boolean existeProduto(String produto){
        try {
            String sql = "select (1) from produtos where idProduto = '"
                    +produto+"'";
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
        
                public String adicionarProduto(Produto mProduto) {
            try {
            String sql = "insert into produtos values ('"
                    +mProduto.getIdProduto()+"','"
                    +mProduto.getDescircao()+"','"
                    +mProduto.getPreco()+ ","
                    +mProduto.getCategoria()+",'"
                    +mProduto.getAnotacao()+"')";
            Statement st;
            st = cnn.createStatement();
            //executa o Update no banco de dados
            st.executeUpdate(sql);
            return "Produto cadastrado com sucesso!";
            
                        
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possivel cadastrar";
        }
        }
                
               
        public String editarProduto(Produto mProduto) {
            try {
            String sql = "update usuarios set "
                    +"descricao = "+mProduto.getDescircao()+"', "
                    +"preco = "+mProduto.getPreco()+", "
                    +"imposto = "+mProduto.getCategoria()+", "
                    +"anotacao = '" + mProduto.getAnotacao() + "',"
                    +"where idUsuario = '"+mProduto.getIdProduto()+"'";
            Statement st;
            st = cnn.createStatement();
            //executa a Update no banco de dados
            st.executeUpdate(sql);
            return "Produto Editado com sucesso!";
            
                        
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possivel Editado";
        }
        }
        
        
        public String deletarProduto(String produto) {
            try {
                String sql = "delete from usuarios where idProduto = '"+produto+"'";
            Statement st;
            st = cnn.createStatement();
            //executa a Update no banco de dados
            st.executeUpdate(sql);
            return "Produto Deletado com sucesso!";
            
                        
        } catch (SQLException ex) {
            Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possivel Deletado";
        }
        }
        
        public ResultSet getProdutos(){
            try {
                    String sql = "SELECT * FROM produtos";
                Statement st = cnn.createStatement();
                //executa a Update no banco de dados
                return st.executeQuery(sql);

            } catch (SQLException ex) {
                Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        
        public int numeroProdutos(){
        try {
                String sql = "SELECT count (*) as num FROM produtos";
                Statement st;
                st = cnn.createStatement();
                //executa a Update no banco de dados
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    return rs.getInt("num");
                } else{
                    return 0;
                }

            } catch (SQLException ex) {
                Logger.getLogger(Dados_DB.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
    }
}
