
package classes;


public class Dados {
    
    private int maxUsuarios = 50;
    private Usuario mUsuarios[] = new Usuario[maxUsuarios];
    private int contUsu = 0;
    private Usuario mUsuario;
    
    public Dados() {
        Usuario mUsuario;
        mUsuario = new Usuario("anderson1", "Anderson", "Moura", "123", 1);
        mUsuarios[contUsu] = mUsuario;
        contUsu++;
        
        mUsuario = new Usuario("anderson2", "Anderson", "Moura", "123", 2);
        mUsuarios[contUsu] = mUsuario;
        contUsu++;
        
        mUsuario = new Usuario("anderson3", "Anderson", "Moura", "123", 1);
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
        
        public String adicionarUsuario(Usuario mUsuario) {
            if (contUsu == maxUsuarios) {
                return "Não é possivel cadastrar mais usuarios(Maximo Atingido).";
            }
            mUsuarios[contUsu] = mUsuario;
            contUsu ++;
            return "Usuario cadastrado com sucesso!!";
        }
            
        public String editarUsuario(Usuario mUsuario, int pos) {
            mUsuarios[pos].setNome(mUsuario.getNome());
            mUsuarios[pos].setSobreNome(mUsuario.getSobreNome());
            mUsuarios[pos].setSenha(mUsuario.getSenha());
            mUsuarios[pos].setPerfil(mUsuario.getPerfil());
            return "Usuario Editado com sucesso!!";
        }
        
        public String deletarUsuario(int pos) {
            for(int i = pos; i < contUsu -1; i++) {
                mUsuarios[i] = mUsuarios[i + 1];
            }
            contUsu--;
            return "Usuario Deletado com sucesso!!";
        }
}
