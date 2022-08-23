
package reto3partido;
import java.util.Random;

/**
 *
 * @author mfcaicedo 
 */
public class Asistente {
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
    private String idTiquete; 
    private String nombreCompleto; 
    private String direccionResidencia; 
    private String credenciales;
    private  int development;
    
    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia){
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia; 
        this.credenciales = "";


    }

    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
    
    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredenciales() {
        if(credenciales.isEmpty()){ 
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencial = String.valueOf(x);
            credenciales = credencial;
        }
    }
}
