/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Registros;

import java.util.Stack;

/**
 *
 * @author User
 */
public class SS {
    Stack<String> pila = new Stack<String>();
    
    public SS(){
        
    }
    
    public void push(String cad){
        pila.push(cad);
    }
    
    public String pop(){
        if(!pila.empty()){
            return pila.pop();
        }else{
            return "";
        }
        
    }
}
