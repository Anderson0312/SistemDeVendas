package classes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public static String getDate(){
		//cria o formatador
		 SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
		 
		 //cria um objeto date com a data do sistema
		 Date dataDoSistema = new Date();
		 
		 //passa o objeto dataDoSistema para uma String da forma que pediu
		 String dataEmTexto = formatador.format(dataDoSistema);  
		 
		 return dataEmTexto;
    }
    
    public static String getDataHora(){
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        
        return hora;
    }
    
    public static int objectToInt(Object Obj) {
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }
    
    public static double objectToDouble(Object Obj) {
        String Str = Obj.toString();
        double NumDouble = Double.valueOf(Str).doubleValue();
        return NumDouble;
    }
    
    public static boolean objectToboolean(Object Obj) {
        String CadBool = objectToString(Obj);
        Boolean bool = Boolean.valueOf(CadBool);
        return bool;
    }

    public static String objectToString(Object Obj) {
        String Str = "";
        if(Obj != null) {
            Str = Obj.toString();
        }
        return Str;
    }
    
    //Função pega string e transforma em double, substituindo vírgulas por ponto
    public double fixMoney(String s){
        char c[] = s.toCharArray();
        int size = s.length();
        for(int i = 1; i < size; i++)
        {
            if (c[i] == ',') c[i] = '.';
        }
        String str = String.valueOf(c);
        
        double d = Double.parseDouble(str);
              
        return d;
    }
    
    
}
