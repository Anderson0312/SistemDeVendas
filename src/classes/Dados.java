
package classes;


public class Dados {
    
    private int maxUsuarios = 50;
    private Usuario mUsuarios[] = new Usuario[maxUsuarios];
    private int contUsu = 0;
    private Usuario mUsuario;
    
    public Dados() {
        Usuario mUsuario = new Usuario("anderson", "Anderson", "Moura", "123", 1);
        mUsuarios[contUsu] = mUsuario;
        contUsu++;
    }
    
     
    public int numeroUsuarios(){
        return contUsu;
    }
    
    
    public Usuario[] getUsuarios(){
         return mUsuarios;
    }
    
    // classe de verifição de usuario
    public boolean validarUsuario(String usuario, String senha){
        boolean aux = false;
        for (int i = 0; i < contUsu; i++){
            if(mUsuarios[i].getIdUsuario().equals(usuario) && mUsuarios[i].getSenha().equals(senha)){
                return true;
            }    
        }
        return false;
    }
    
        public boolean existeUsuario(String usuario){
        boolean aux = false;
        for (int i = 0; i < contUsu; i++){
            if(mUsuarios[i].getIdUsuario().equals(usuario)){
                return true;
            }    
        }
        return false;
    }
        
    public int posicaoUsuario(String usuario){
        
        for (int i = 0; i < contUsu; i++){
            if(mUsuarios[i].getIdUsuario().equals(usuario)){
               System.out.println("classes.Dados.posicaoUsuario()" + mUsuarios[i].getIdUsuario().equals(usuario));
                return i;                
            }    
        }
        return -1;
    }
        
        public String adicionarUsuario(Usuario msUsuario) {
            if (contUsu == maxUsuarios) {
                return "Não é possivel cadastrar mais usuarios(Maximo Atingido).";
            }
            mUsuarios[contUsu] = mUsuario;
            contUsu ++;
            return "Usuario cadastrado com sucesso!!";
        }
            
}
