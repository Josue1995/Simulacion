/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Registros;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AC {
    private String dato;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public AC(String dato) {
        this.dato = dato;
    }
    public AC() {
     
    }
    
    public int binarioDecimal(String bin){
        int decimal = Integer.parseInt(bin, 2);
        return decimal;
    }
    
    public void decimalABinario(String decimal){
        int num = Integer.parseInt(decimal);
        String binario = Integer.toBinaryString(num);
        this.setDato(binario);
    }
    
    
    public void sumar(String dir){
    int a = Integer.parseInt(dir, 2);
    if(this.dato == null)
    {
        int c = a;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }else{
        int b = Integer.parseInt(this.dato, 2);
        int c = a + b;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    } 
 }
    public void restar(String dir){
        int a = Integer.parseInt(dir, 2);
    if(this.dato == null)
    {
        int c = a;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }else{
        int b = Integer.parseInt(this.dato, 2);
        int c = a - b;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }
 }
    public void multiplicar(String dir){
        int a = Integer.parseInt(dir, 2);
    if(this.dato == null)
    {
        int c = a;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }else{
        int b = Integer.parseInt(this.dato, 2);
        int c = a * b;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }
  }
    public void dividir(String dir){
        int a = Integer.parseInt(dir, 2);
    if(this.dato == null)
    {
        int c = a;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }else{
        int b = Integer.parseInt(this.dato, 2);
        int c = a / b;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }
    
  }
    public void inc(String dir){
        int a = Integer.parseInt(dir, 2);
        int b = Integer.parseInt("0001", 2);
        int c = a + b;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }
    
    public void dec(String dir){
        int a = Integer.parseInt(dir, 2);
        int b = Integer.parseInt("0001", 2);
        int c = a - b;
        String r = Integer.toString(c, 2);
        this.setDato(r);
    }
  
    public void negar(String dir){
        String y = dir;
        String c = "";
        for(int x = 0; x <= 15; x++){
                if(y.charAt(x) == '0'){
                    c += "1";
                }else{
                    c += "0";
                }
             }
        this.setDato(c);
    }
    public void vAbsoluto(String dir){
        String mem = dir;
        String c = "";
        c += "0";
        for(int x = 1; x <= 15; x++){
            c += mem.charAt(x);
        }
        this.setDato(c);
    }
}
