/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

/**
 *
 * @author Tecnicos
 */
public class Hija extends Padre{
    
    public String saludar(){ //sobreescritura
        return "Hola desde Hija";
    }
    
    public String saludar(String nombre){
        return "Hola " + nombre + " con sobrecarga desde hija";
    }
}
