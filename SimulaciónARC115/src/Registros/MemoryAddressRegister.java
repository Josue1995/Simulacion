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
public class MemoryAddressRegister {
    private ProgramCounter pc;

    public MemoryAddressRegister() {
    }

    public MemoryAddressRegister(ProgramCounter pc) {
        this.pc = pc;
    }

    public ProgramCounter getPc() {
        return pc;
    }

    public void setPc(ProgramCounter pc) {
        this.pc = pc;
    }
    
}
