/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author claudio.silva
 */
public class Empresa {
    public String cargo;
    public String departamento;
    
    public Empresa(){

}
     public String imprimir() {
        String texto = 
                "\nCargo: " + this.cargo +
                "\nDepartamento: " + this.departamento;
               
        
        return texto;

    }
}

