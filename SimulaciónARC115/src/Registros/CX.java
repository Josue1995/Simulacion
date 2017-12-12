/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Registros;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CX {
    
    private String content;
    private String ch;
    private String cl;
    private final String direccion = "000011";
    private final String direccionCH = "001001";
    private final String direccionCL = "001010";

    public String getDireccionCH() {
        return direccionCH;
    }

    public String getDireccionCL() {
        return direccionCL;
    }

    public CX() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }
    
    
    public String getDireccion (){
        return this.direccion;
    }
    
    
    
}
