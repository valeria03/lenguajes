/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo1.abstraccion;

/**
 *
 * @author campitos
 */
public class SistemaDePago {


    public static void main(String args[]){
     Usuario u = new Usuario();
     u.setNombre("pedro");
     u.setHorasTrabajadas(40);
     u.setSueloBase(3000); 
     Pago p=new Pago();
     p.hacerPago(u);
    }
    
    
}
