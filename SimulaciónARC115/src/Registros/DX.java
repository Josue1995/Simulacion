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
public class DX {
    
    private String content;
    private String dh;
    private String dl;
    private final String direccion = "000100";
    private final String direccionDH = "001011";
    private final String direccionDL = "001100";

    public String getDireccionDH() {
        return direccionDH;
    }

    public String getDireccionDL() {
        return direccionDL;
    }

    public DX() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }
    
    public String getDireccion (){
        return this.direccion;
    }
    
}
