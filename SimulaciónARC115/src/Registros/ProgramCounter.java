/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Registros;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramCounter {

    private String direccion;

    public ProgramCounter() {
    }
    
    public ProgramCounter(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String sumar(String dir){
    int a = Integer.parseInt(dir, 2);
    int b = Integer.parseInt("0001", 2);
    int c = a + b;
    String r = Integer.toString(c, 2);
    System.out.println(r);
    return r;
    }
    
    public boolean verificar(String text){
        try{
            Integer.parseInt(text);
            return true;
            
            
        }catch (NumberFormatException nfe){
            return false;
        }
        
    }
    
    public void decimalABinario(String decimal){
        int num = Integer.parseInt(decimal);
        String binario = Integer.toBinaryString(num);
        this.setDireccion(binario);
    }
    

}