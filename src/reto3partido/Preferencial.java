/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3partido;

/**
 *
 * @author mfcaicedo
 */
public class Preferencial extends Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
    private boolean participaSorteo; 
    
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia){
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;
    }

    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
    
    public void participarSorteo(){
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //participarSorteo()
        if (participaSorteo == true) {
            this.setParticipaSorteo(false);
        }else{
            this.setParticipaSorteo(true);
        }
    }
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO
    
}
