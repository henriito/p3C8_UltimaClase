package org.reproductor;

import org.listas.Lista;


import java.util.Scanner;

public class ListaCancion {
    public NodoMusic primero;
    public ListaCancion(){
        primero = null;
    }

    private int leerEntero(){
        System.out.println("Ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    private Cancion leerCancion(){
        Cancion c = new Cancion();
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese ubicacion");
        c.setUbicacion(s.nextLine()) ;
        System.out.println("ingrese nombre canciion -1 para terminar");
        c.setNombre(s.nextLine()) ;
        return c;
    }

    public ListaCancion crearLista(){
        Cancion x = new Cancion();
        x.setNombre("un ladrio mas en la pared");
        x.setUbicacion("C:\\Users\\jose\\Desktop\\un ladrio mas en la pared.mp3");
        NodoMusic nc = new NodoMusic(x);
        primero = null;
        do {
            x=leerCancion();
            if (x.getNombre() != "-1"){
                primero = new NodoMusic(x,primero);
            }
        } while (x.getNombre() != "-1");
        return this;
    }


}
