package org.example;

import org.listas.Lista;

public class Main {
    public static void main(String[] args) {

       Lista l = new Lista();
       var respuesta = l.crearLista();
       // System.out.println(respuesta);
        respuesta.visualizar();
    }
}