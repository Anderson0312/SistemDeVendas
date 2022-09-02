package classes;

/**
 *
 * @author AndersoNMN
 */
public class Produto {
    
    private String idProduto;
    private String descircao;
    private double preco;
    private int imposto;
    private String anotacao;
    
    public Produto(String idProduto, String descircao, double preco, int imposto, String anotacao) {
        this.idProduto = idProduto;
        this.descircao = descircao;
        this.preco = preco;
        this.imposto = imposto;
        this.anotacao = anotacao;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCategoria() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
    
    
    @Override
    public String toString(){
        
        return idProduto + "|"
               +descircao+ "|" 
                +preco+ "|"
                +imposto+ "|"
                +anotacao;
        
    }
    
}
