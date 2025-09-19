/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajolab5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Humberto
 */
public class Directorio {

    public static TreeMap<Long, Contacto> contactos;

    public Directorio() {
        this.contactos = new TreeMap<>();
    }

    // A. agregar contactos
    public void agregarContacto (Long telefono, Contacto contacto) {
        contactos.put(telefono, contacto);
    }

    // B.Buscar contactos por numero
    public Contacto buscarContacto (Long telefono) {
        return contactos.get(telefono);
    }

    public Set<Long> buscarTelefono (String apellido) {
        Set<Long> listaTel = new HashSet<>();
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (apellido.equalsIgnoreCase(entry.getValue().getApellido())) {
                listaTel.add(entry.getKey());
            }
        }
        System.out.println("Apellido " + apellido + ": ");
        return listaTel;
    }

    public ArrayList<Contacto> buscarContactos (String ciudad) {
        ArrayList<Contacto> contactosCiudad = new ArrayList<>();
        for (Contacto cont : contactos.values()) {
            if (ciudad.equalsIgnoreCase(cont.getCiudad())) {
                contactosCiudad.add(cont);
            }
        }
        return contactosCiudad;
    }

    public void borrarContacto (Long telefono) {
        if (contactos.remove(telefono) != null) {
            System.out.println("Contacto eliminado");
        } else {
            System.out.println("Contacto no encontrado");
        }
     
    }
    
        public void borrarContactoDni (Long dni) {
        if (contactos.remove(dni) != null) {
            System.out.println("Contacto eliminado");
        } else {
            System.out.println("Contacto no encontrado");
        }
     
    }

  
    
}
