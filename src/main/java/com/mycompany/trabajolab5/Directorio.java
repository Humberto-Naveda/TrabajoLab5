/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajolab5;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Humberto
 */
public class Directorio {

    private TreeMap<Long, Contacto> contactos;

    public Directorio() {
        this.contactos = new TreeMap<>();
    }

    // A. agregar contactos
    public void agregarContacto(Long telefono, Contacto contacto) {
        contactos.put(telefono, contacto);
    }

    // B.Buscar contactos por numero
    public Contacto buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

    public Long buscarTelefono(String apellido) {
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (apellido.equalsIgnoreCase(entry.getValue().getApellido())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactosCiudad = new ArrayList<>();
        for (Contacto cont : contactos.values()) {
            if (ciudad.equalsIgnoreCase(cont.getCiudad())) {
                contactosCiudad.add(cont);
            }
        }
        return contactosCiudad;
    }

    public void borrarContacto(Long telefono) {
        if (contactos.remove(telefono) != null) {
            System.out.println("Contacto eliminado");
        } else 
            System.out.println("Contacto no encontrado");
        }
    
    public static ArrayList<String> lista= new ArrayList<>();
    }


