
package reto3partido;
import java.util.Random;
/**
 *
 * @author mfcaicedo
 */
public class VIP extends Asistente{
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
    private boolean[]   pantallas = new boolean[] {false, false, false};
    private String credencialesPrevia = "";
    public VIP(String idTiqute, String nombreCompleto, String direccionResidencia){
        super(idTiqute, nombreCompleto, direccionResidencia);
    }

    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }
    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    public void asignarPantalla(int pantalla){
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //asignarPantalla()
        if(pantalla >= 1 && pantalla < 3){
            if(pantallas[pantalla] == true){
                pantallas[pantalla] = false;
            }else{
                pantallas[pantalla] = true;
            }
        }
    }
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    
}
