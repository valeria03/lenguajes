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
public class Usuario {
    private String nombre;
    private float sueloBase;
    private int horasTrabajadas;

    public Usuario() {
    }
    

    public Usuario(String nombre, float sueloBase, int horasTrabajadas) {
        this.nombre = nombre;
        this.sueloBase = sueloBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueloBase() {
        return sueloBase;
    }

    public void setSueloBase(float sueloBase) {
        this.sueloBase = sueloBase;
    }
    
}
