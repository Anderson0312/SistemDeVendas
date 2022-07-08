
package classes;

public class Dados {
    // classe de verifição de usuario
    public boolean validarUsuario(String usuario, String senha){
        if (usuario.equals("anderson") && senha.equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}
