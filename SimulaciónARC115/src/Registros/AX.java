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
public class AX {
    
    private String content;
    private String ah;
    private String al;
    private final String direccion = "000001";
    private final String direccionAH = "000101";
    private final String direccionAL = "000110";

    public String getDireccionAH() {
        return direccionAH;
    }

    public String getDireccionAL() {
        return direccionAL;
    }

    public AX() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }  

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getAl() {
        return al;
    }

    public void setAl(String al) {
        this.al = al;
    }
    
    public String getDireccion (){
        return this.direccion;
    }
    
}
