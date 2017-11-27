/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Registros;

/**
 *
 * @author User
 */
public class MemoryBufferRegister {
    private String instruccion;
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

     public MemoryBufferRegister() {
    } 
    
    public MemoryBufferRegister(String instruccion, String direccion) {
        this.instruccion = instruccion;
        this.direccion = direccion;
     }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }
    
    public int binarioDecimal(String bin){
        int decimal = Integer.parseInt(bin, 2);
        return decimal;
    }
   
    public void clear(){
        String aux = "0000000000000000";
        this.setDireccion(aux);
        
    }
    
    public void set(){
        String aux = "1111111111111111";
        this.setDireccion(aux);
    }
            
    
}
