/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24video30;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ejercicio24Video30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        coche2 p = new coche2();
        
        p.establecer_color();
        
        JOptionPane.showMessageDialog(null,"PROGRAMA CARACTERISTICAS AUTOMOVIL");
        
        System.out.println(p.dimelargo());
        
        System.out.println(p.dime_color());
        
    }
    
}
