package classes;

/**
 *
 * @author AndersoNMN
 */
public class Opcoes {
    private String valor;
    private String descrição;

    public Opcoes(String valor, String descrição) {
        this.valor = valor;
        this.descrição = descrição;
    }

    public String getValor() {
        return valor;
    }

    public String getDescrição() {
        return descrição;
    }

    @Override
    public String toString() {
        return  descrição;
    }
    
}
