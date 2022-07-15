
package classes;
import formularios.frmLogin1;

public class JavaVenda {
/**
 *
 * @author AndersoNMN
 */

    public static void main(String[] args) {
        Dados msDados = new Dados(); // chama a classe dados e cria a varivel msDados
        frmLogin1 miLogin = new frmLogin1();
        miLogin.setDados(msDados);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
}
