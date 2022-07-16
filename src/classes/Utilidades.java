package classes;

/**
 *
 * @author AndersoNMN
 */
public class Utilidades {
    
    public static boolean isNumeric(String Numero) {
        try {
            Integer.parseInt(Numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
