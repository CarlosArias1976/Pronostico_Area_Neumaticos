/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pronostico_area_neumaticos;

/**
 *
 * @author Carlos Areas
 */
class Area_Neumatico{
//Atributos
    private int neumatico;
    private int acelerometro;
    private String sensorflexion;
    private String suspensionactiva;
    
//Constructores
    public Area_Neumatico(int pneumatico, int pacelerometro, String psensorflexion, String psuspensionactiva){
    neumatico=pneumatico;
    acelerometro=pacelerometro;
    sensorflexion=psensorflexion;
    suspensionactiva=psuspensionactiva;
    }
//Metodos
    public int getneumatico(){
        return neumatico;
    }
    public void setneumatico(int neumatico){
        this.neumatico=neumatico;
    }
    public int getacelerometro(){
        return acelerometro;
    }
    public void setacelerometro(int acelerometro){
        this.acelerometro=acelerometro;
    }
    public String getsensorflexion(){
        return sensorflexion;
    }
    public void setsensorflexion(String sensorflexion){
        this.sensorflexion=sensorflexion;
    }
    public String getsuspensionactiva(){
        return suspensionactiva;
    }
    public void setsuspensionactiva(String suspensionactiva){
        this.suspensionactiva=suspensionactiva;
    }
    @Override
    public String toString(){
        return "Area Neumatico, el sensor indica "+sensorflexion+" de "
                + neumatico+" y el sensor de suspension activa muestra "
                +suspensionactiva+" con antelacion de "+acelerometro;
    }
}
public class Pronostico_Area_Neumaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Area_Neumatico neumatico1=new Area_Neumatico(240,33,"Area de contacto","Predice");
        Area_Neumatico neumatico2=new Area_Neumatico(255,32,"Area de contacto","Predice");
        System.out.println(neumatico1.toString());
        System.out.println(neumatico2.toString());
        neumatico1.setneumatico(270);
        if(neumatico1.getneumatico()<neumatico2.getneumatico()){
            System.out.println(neumatico1.getsensorflexion()+" es mayor para el primer caso");
        }
        else{
            System.out.println(neumatico2.getsensorflexion()+" es mayor para el segundo caso");
        }
    }
    
}