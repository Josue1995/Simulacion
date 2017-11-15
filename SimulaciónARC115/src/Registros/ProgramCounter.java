/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Registros;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgramCounter {
    int a = Integer.parseInt("0111", 2);
    int b = Integer.parseInt("0001", 2);
    int c = a + b;
    String r = Integer.toString(c, 2);
    System.out.println("Resultado: " + r);
}