/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author LuiizMusic11
 */
public class Examen {
    
    private static Agenda formulario;
    private static Persona persona [];
    private static int contador;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        formulario = new Agenda();
        persona = new Persona [5];
        
        for (int i=0; i<5; i++){
        persona[i] = new Persona();
    }
       contador=0;
       
       formulario.setVisible(true);
    }
    
    public static void guardar(String n, String a, String c, int cel){
        //4 variables 
        // Nombre n, Apellido a, Correo c, Celular c
    
        persona[contador].setNombre(n);
        persona[contador].setApellido(a);
        persona[contador].setCoreo(c);
        persona[contador].setCelular(cel);
        
        contador++;
    }
    
    public static void buscar(String bus){
        //Variable y btn bus
        
        for(int j=0; j < persona.length; j++){
            if(persona[j].getNombre().equals(bus)){
                formulario.cargardatos(persona[j]);
            }
        }
        
    }
    
    
}
