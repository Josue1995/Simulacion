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

     public MemoryBufferRegister() {
    } 
    
    public MemoryBufferRegister(String instruccion) {
        this.instruccion = instruccion;
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
   
    
}
