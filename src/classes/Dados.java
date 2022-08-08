
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author AndersoNMN
 */
public class Dados {
    
    private final int maxUsuarios = 50;
    private int maxProdutos = 100;
    private int maxCliente = 100;
    private Usuario mUsuarios[] = new Usuario[maxUsuarios];
    private Produto mProdutos[] = new Produto[maxProdutos];
    private Cliente mClientes[] = new Cliente[maxCliente];
    private int contUsu = 0;
    private int contProd = 0;
    private int contClient = 0;
    private Usuario mUsuario;
    private int numFatura = 0;
    
    public Dados() {
        
          preencherUsuarios();
               
          preencherProdutos();
          
          preencherClientes();
          
          preencherConfiguracao();
          
    }
    
    public int getNumeroFatura(){
        return numFatura;
    }
    
    public void setNumeroFatura(int numFatura){
        this.numFatura = numFatura;
    }
     
    public int numeroUsuarios(){
        return contUsu;
    }
    
    public int numeroProdutos(){
        return contProd;
    }
    
    
    public int numeroClientes(){
        return contClient;
    }
    
    
    public Usuario[] getUsuarios(){
         return mUsuarios;
    }
    
    public Produto[] getProdutos(){
         return mProdutos;
    }
    
    public Cliente[] getClientes(){
         return mClientes;
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
    
    
    // classe de verifição de usuario e validar se é o adm ou usuario simples
    public int getPerfil(String usuario){
        
        for (int i = 0; i < contUsu; i++){
            if(mUsuarios[i].getIdUsuario().equals(usuario)){
                return mUsuarios[i].getPerfil();
            }    
        }
        return -1;
    }
    
    public void trocarSenha(String usuario, String senha){
        
        for (int i = 0; i < contUsu; i++){
            if(mUsuarios[i].getIdUsuario().equals(usuario)){
                mUsuarios[i].setSenha(senha);
                return;
            }    
        }
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
    
    
    // varre a lista de cliente e adiciona uma possição para cada um
    public int posicaoCliente(String cliente){
        
        for (int i = 0; i < contClient; i++){
            if(mClientes[i].getIdCliente().equals(cliente)){
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
     
        
    // Adiciona o Cliente a lista se o Numero maximo não tiver sido atingido
        public String adicionarCliente(Cliente mCliente) {
            if (contClient == maxCliente) {
                return "Não é possivel cadastrar mais Cliente (Maximo Atingido).";
            }
            mClientes[contClient] = mCliente;
            contClient ++;
            return "Cliente cadastrado com sucesso!!";
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
        
        
        // Edita o Cliente desejado verificando a posição dele na lista de usuarios
        public String editarCliente(Cliente mCliente, int pos) {
            mClientes[pos].setIdCliente(mCliente.getIdCliente());
            mClientes[pos].setNome(mCliente.getNome());
            mClientes[pos].setSobreNome(mCliente.getSobreNome());
            mClientes[pos].setEndereco(mCliente.getEndereco());
            mClientes[pos].setEmail(mCliente.getEmail());
            mClientes[pos].setTelefone(mCliente.getTelefone());
            mClientes[pos].setCidade(mCliente.getCidade());
            return "Cliente Editado com sucesso!!";
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
        
        
        // deleta o Cliente escolhido de acordo com a possição
        public String deletarCliente(int pos) {
            for(int i = pos; i < contClient -1; i++) {
                mClientes[i] = mClientes[i + 1];
            }
            contClient--;
            return "Cliente Deletado com sucesso!!";
        }
        
        public void salvarDados(){
            salvarUsuarios();
            salvarClientes();
            salvarProdutos();
            salvarConfiguracao();
        }
        
        public void salvarUsuarios(){
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/Usuarios.txt");
                pw = new PrintWriter(fw);
                for (int i = 0; i <  contUsu; i++) {
                    pw.println(mUsuarios[i].toString());
                }
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally{
                try {
                    if(fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        
        public void salvarClientes(){
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/Clientes.txt");
                pw = new PrintWriter(fw);
                for (int i = 0; i <  contClient; i++) {
                    pw.println(mClientes[i].toString());
                }
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally{
                try {
                    if(fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        
        public void salvarProdutos(){
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/Produtos.txt");
                pw = new PrintWriter(fw);
                for (int i = 0; i <  contProd; i++) {
                    pw.println(mProdutos[i].toString());
                }
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally{
                try {
                    if(fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        
        
        public void salvarConfiguracao(){
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/Configuracao.ini");
                pw = new PrintWriter(fw);
                
                pw.println("[Geral]");
                pw.println("FaturaAtual="+numFatura);
                
                
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally{
                try {
                    if(fw != null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        
        
        public void preencherUsuarios() {
            File arquivo = null;
            FileReader fr = null;
            
            BufferedReader br = null;
            
            try {
                arquivo = new File("Data/Usuarios.txt");
                fr = new FileReader(arquivo);
                br = new BufferedReader(fr);
                
                int pos;
                String aux;
                String linha;
                String idUsuario; 
                String nome; 
                String sobreNome; 
                String senha; 
                int perfil; 
                 
                while((linha = br.readLine())!= null) {
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    idUsuario =  aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    nome =  aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    sobreNome =  aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    senha =  aux;
                    linha = linha.substring(pos + 1);
                    perfil = Integer.parseInt(linha);
                    
                    
                    Usuario mUsuario = new Usuario(
                            idUsuario,
                            nome,
                            sobreNome,
                            senha,
                            perfil);
                    
                    mUsuarios[contUsu] = mUsuario;
                    contUsu ++;
                }
                 
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally {
                try {
                    if(fr != null) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        
        
        public void preencherProdutos() {
            File arquivo = null;
            FileReader fr = null;
            
            BufferedReader br = null;
            
            try {
                arquivo = new File("Data/Produtos.txt");
                fr = new FileReader(arquivo);
                br = new BufferedReader(fr);
                
                int pos;
                String aux;
                String linha;
                String idProduto;
                String descircao;
                Double preco;
                int imposto;
                String anotacao; 
                 
                while((linha = br.readLine())!= null) {
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    idProduto =  aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    descircao =  aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    preco = Double.valueOf(aux);
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    imposto = Integer.parseInt(aux);
                    linha = linha.substring(pos + 1);
                    anotacao = linha;
                    
                    
                    Produto mProduto = new Produto(
                            idProduto,
                            descircao,
                            preco,
                            imposto,
                            anotacao);
                    
                    mProdutos[contProd] = mProduto;
                    contProd ++;
                }
                 
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally {
                try {
                    if(fr != null) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        
        
        
            public void preencherClientes() {
            File arquivo = null;
            FileReader fr = null;
            
            BufferedReader br = null;
            
            try {
                arquivo = new File("Data/Clientes.txt");
                fr = new FileReader(arquivo);
                br = new BufferedReader(fr);
                
                int pos;
                String aux;
                String linha;
                String idCliente;
                String nome;
                String sobreNome;
                String endereco;
                String email;
                String telefone;
                int cidade;
                 
                while((linha = br.readLine())!= null) {
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    idCliente =  aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0, pos);
                    nome =  aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    sobreNome = aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    endereco = aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    email = aux;
                    linha = linha.substring(pos + 1);
                    
                    pos = linha.indexOf('|');
                    aux = linha.substring(0,pos);
                    telefone = aux;
                    linha = linha.substring(pos + 1);
                    cidade = Integer.parseInt(linha);
                    
                    
                    Cliente mCliente = new Cliente(
                            idCliente,
                            nome,
                            sobreNome,
                            endereco,
                            email,
                            telefone,
                            cidade
                            );
                    
                    mClientes[contClient] = mCliente;
                    contClient ++;
                }
                 
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally {
                try {
                    if(fr != null) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
            
            
            
    public void preencherConfiguracao() {
            File arquivo = null;
            FileReader fr = null;
            
            BufferedReader br = null;
            
            try {
                arquivo = new File("Data/Configuracao.ini");
                fr = new FileReader(arquivo);
                br = new BufferedReader(fr);
                
                String linha;
                                 
                while((linha = br.readLine())!= null) {
                    if (linha.startsWith("FatruaAtual=")){
                        numFatura = Integer.parseInt(linha.substring(13));
                    }
                   
                }           
            } catch (Exception e1) {
                e1.printStackTrace();
                
            } finally {
                try {
                    if(fr != null) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }


}
