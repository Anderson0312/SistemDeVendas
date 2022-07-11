package classes;

/**
 *
 * @author AndersoNMN
 */
public class Usuario {
    private String idUsuario; 
    private String nome; 
    private String sobreNome; 
    private String senha; 
    private int perfil; 

    public Usuario(String idUsuario, String nome, String sobreNome, String senha, int perfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
    
}
