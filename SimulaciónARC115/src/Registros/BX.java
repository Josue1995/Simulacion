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
public class BX {
    
    private String content;
    private String bh;
    private String bl;
    private final String direccion = "000010";
    private final String direccionBH = "000111";
    private final String direccionBL = "001000";

    public String getDireccionBH() {
        return direccionBH;
    }

    public String getDireccionBL() {
        return direccionBL;
    }
    
    public BX() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public String getDireccion (){
        return this.direccion;
    }
   

    
    
    
    
}
