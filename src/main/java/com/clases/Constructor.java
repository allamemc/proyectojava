/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

/**
 *
 * @author Tecnicos
 */
public class Constructor {
    public String nombre;

    public Constructor(String nombre) {
        this.nombre = nombre;
    }
    
    public Constructor() {
        
    }
    
    public String saludar() {
        if (nombre != null) {
            return "Hola " + nombre;
        } else {
            return "Hola sin nombre";
        }
    }
}
