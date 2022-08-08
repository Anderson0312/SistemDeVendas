package classes;

/**
 *
 * @author AndersoNMN
 */
public class Cliente {
    private String idCliente;
    private String nome;
    private String sobreNome;
    private String endereco;
    private String email;
    private String telefone;
    private int cidade;

    public Cliente(String idCliente, String nome, String sobreNome, String endereco, String email, String telefone, int cidade) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        
        this.telefone = telefone;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }
    
    
    @Override
    public String toString(){
        
        return idCliente + "|"
               +nome+ "|"
                +sobreNome+ "|"
                +endereco+ "|"
                +email+"|"
                +telefone+ "|"
                +cidade;
        
    }
    
}
