/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajolab5;

import com.mycompany.trabajolab5.Interfaz.Ciudades;

/**
 *
 * @author Humberto
 */
public class TrabajoLab5 {

    public static void main(String[] args) {
	Ciudades ciudad=new Ciudades();
        ciudad.setVisible(true); //hace visible pantalla(interfaz)
        ciudad.setLocationRelativeTo(null); //centra pantalla


        Contacto contact1 = new Contacto("54546765", "Juan", "Lopez", "San Luis", "Los Alamos 456");
        Contacto contact2 = new Contacto("54376588", "Lucas", "Moura", "La Toma", "Av. Palito 2343");
        Contacto contact3 = new Contacto("34564574", "Marcos", "Diaz", "Merlo", "Las Heras 406");
        Contacto contact4 = new Contacto("76964536", "Mia", "Alvarez", "Buenos Aires", "Av. Balcarce 567");
        Contacto contact5 = new Contacto("25454565", "Martina", "Lopez", "San Luis", "Los Alamos 456");

        Directorio dir1 = new Directorio();

        dir1.agregarContacto(333455787L, contact1);
        dir1.agregarContacto(266546767L, contact2);
        dir1.agregarContacto(346434536L, contact3);
        dir1.agregarContacto(123457654L, contact4);
        dir1.agregarContacto(454656764L, contact5);

        System.out.println("Buscando contactos por numero telefonico.");
        System.out.println("");

        System.out.println(dir1.buscarContacto(123457654L));
        System.out.println(dir1.buscarContacto(266546767L));

        System.out.println("");

        System.out.println("Buscando telefonos por apellido de contacto");
        System.out.println("");

        System.out.println(dir1.buscarTelefono("Lopez"));
        System.out.println(dir1.buscarTelefono("Diaz"));

        System.out.println("");

        System.out.println("Buscando contactos por ciudad");
        System.out.println("");

        System.out.println(dir1.buscarContactos("San Luis"));

        System.out.println("");

        System.out.println("Borrando contactos por numero telefonico");
        System.out.println("");

        dir1.borrarContacto(123457654L);

    }
}
