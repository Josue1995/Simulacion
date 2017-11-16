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
public class InstructionRegister {
    private MemoryBufferRegister mbr;

    public InstructionRegister() {
    }

    public InstructionRegister(MemoryBufferRegister mbr) {
        this.mbr = mbr;
    }

    public MemoryBufferRegister getMbr() {
        return mbr;
    }

    public void setMbr(MemoryBufferRegister mbr) {
        this.mbr = mbr;
    }
    
}
