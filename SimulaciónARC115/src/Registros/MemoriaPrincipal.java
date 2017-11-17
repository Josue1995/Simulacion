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
public class MemoriaPrincipal {
    private ArrayList<String> n = new ArrayList<String>();

    public MemoriaPrincipal() {
    }

    public ArrayList<String> getN() {
        return n;
    }

    public void setN(ArrayList<String> n) {
        this.n = n;
    }
    
    public String buscar(int s){
        return this.n.get(s-1);
    }
    
    public void moverBuffer(){
        
    }
}
