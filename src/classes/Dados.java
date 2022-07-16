
package classes;

/**
 *
 * @author AndersoNMN
 */
public class Dados {
    
    private int maxUsuarios = 50;
    private int maxProdutos = 100;
    private Usuario mUsuarios[] = new Usuario[maxUsuarios];
    private Produto mProdutos[] = new Produto[maxProdutos];
    private int contUsu = 0;
    private int contProd = 0;
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
        
        
        
        Produto mProduto;
        mProduto = new Produto("1", "Arroz", 43, 0, "Arroz branco" );
        mProdutos[contProd] = mProduto;
        contProd++;
        
        
        mProduto = new Produto("2", "feijão", 53, 1, "Feijão Preto" );
        mProdutos[contProd] = mProduto;
        contProd++;
        
        
        mProduto = new Produto("3", "Macarrão", 23, 0, "Macarrão enroladinho" );
        mProdutos[contProd] = mProduto;
        contProd++;
        
        
        mProduto = new Produto("4", "Carne", 143, 2, "Carne de boi" );
        mProdutos[contProd] = mProduto;
        contProd++;
    }
    
    
     
    public int numeroUsuarios(){
        return contUsu;
    }
    
    public int numeroProdutos(){
        return contProd;
    }
    
    
    public Usuario[] getUsuarios(){
         return mUsuarios;
    }
    
    public Produto[] getProdutos(){
         return mProdutos;
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
    
    
    // Faz uma verificação se o usuario Existe ou não na lista
        public boolean existeUsuario(String usuario){
        boolean aux = false;
        for (int i = 0; i < contUsu; i++){
            if(mUsuarios[i].getIdUsuario().equals(usuario)){
                return true;
            }    
        }
        return false;
    }
    
        
    // varre a lista de Usuarios e adiciona uma possição para cada um
    public int posicaoUsuario(String usuario){
        
        for (int i = 0; i < contUsu; i++){
            if(mUsuarios[i].getIdUsuario().equals(usuario)){
               System.out.println("classes.Dados.posicaoUsuario()" + mUsuarios[i].getIdUsuario().equals(usuario));
                return i;                
            }    
        }
        return -1;
    }
    
    // varre a lista de Produto e adiciona uma possição para cada um
    public int posicaoProduto(String produto){
        
        for (int i = 0; i < contProd; i++){
            if(mProdutos[i].getIdProduto().equals(produto)){
                return i;                
            }    
        }
        return -1;
    }
        
    
    // Adiciona o usuario a lista se o Numero maximo não tiver sido atingido
        public String adicionarUsuario(Usuario mUsuario) {
            if (contUsu == maxUsuarios) {
                return "Não é possivel cadastrar mais usuarios(Maximo Atingido).";
            }
            mUsuarios[contUsu] = mUsuario;
            contUsu ++;
            return "Usuario cadastrado com sucesso!!";
        }
        
        
    // Adiciona o Produto a lista se o Numero maximo não tiver sido atingido
        public String adicionarProduto(Produto mProduto) {
            if (contProd == maxProdutos) {
                return "Não é possivel cadastrar mais Produtos (Maximo Atingido).";
            }
            mProdutos[contProd] = mProduto;
            contProd ++;
            return "Produto cadastrado com sucesso!!";
        }
          
        
        // Edita o usuario desejado verificando a posição dele na lista de usuarios
        public String editarUsuario(Usuario mUsuario, int pos) {
            mUsuarios[pos].setNome(mUsuario.getNome());
            mUsuarios[pos].setSobreNome(mUsuario.getSobreNome());
            mUsuarios[pos].setSenha(mUsuario.getSenha());
            mUsuarios[pos].setPerfil(mUsuario.getPerfil());
            return "Usuario Editado com sucesso!!";
        }
        
        
        // Edita o Produto desejado verificando a posição dele na lista de usuarios
        public String editarProduto(Produto mProduto, int pos) {
            mProdutos[pos].setDescircao(mProduto.getDescircao());
            mProdutos[pos].setPreco(mProduto.getPreco());
            mProdutos[pos].setImposto(mProduto.getImposto());
            mProdutos[pos].setAnotacao(mProduto.getAnotacao());
            return "Produto Editado com sucesso!!";
        }
        
        
        // deleta o usuario escolhido de acordo com a possição
        public String deletarUsuario(int pos) {
            for(int i = pos; i < contUsu -1; i++) {
                mUsuarios[i] = mUsuarios[i + 1];
            }
            contUsu--;
            return "Usuario Deletado com sucesso!!";
        }
        
        // deleta o Produto escolhido de acordo com a possição
        public String deletarProduto(int pos) {
            for(int i = pos; i < contProd -1; i++) {
                mProdutos[i] = mProdutos[i + 1];
            }
            contProd--;
            return "Produto Deletado com sucesso!!";
        }
}
