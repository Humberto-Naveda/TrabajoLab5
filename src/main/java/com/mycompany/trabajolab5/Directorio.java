/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajolab5;

import java.util.TreeMap;

/**
 *
 * @author Humberto
 */
public class Directorio {
    
    private TreeMap<Long,Contacto> contactos;

    public Directorio() {
        this.contactos = new TreeMap<>();
    }
    
   // A. agregar contactos
    
    public void agregarContacto(Long telefono, Contacto contacto){
        contactos.put(telefono, contacto);
    }
    
    // B.Buscar contactos por numero
    
    public Contacto buscarContacto(Long telefono){
        return contactos.get(telefono);
    }
    
    
}
