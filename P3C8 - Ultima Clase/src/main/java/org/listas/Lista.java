package org.listas;

import java.util.Scanner;

public class Lista {
    public Nodo primero;
    public Lista(){
        primero = null;
    }

    private int leerEntero(){
        System.out.println("Ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    public Lista crearLista(){
        int x=0;
        primero = null;
        do {
            x=leerEntero();
            if (x != -1){
                primero = new Nodo(x,primero);
            }
        } while (x != -1);
        return this;
    }

    public Lista insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }


    public void visualizar(){
        Nodo n;
        int k =0;
        n = primero;
        while (n!= null){
            System.out.println(n.dato+" ");
            n = n.enlace;
            k++;
            System.out.print( (k%15 !=0 ? " " : "\n")  );
        }
    }


    public Nodo buscarPosicion(int posicion){
        Nodo indice;
        int i;
        if (posicion < 0){
            return null;
        }
        indice = primero;
        for (i=1;(i< posicion)&&(indice != null); i++ ){
            indice = indice.enlace;
        }
        return indice;
    }

    public Lista insertaUltimo(Nodo ultimo, int entrada){
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return  this;
    }

    public Nodo buscarLista(int destino){
        Nodo indice;
        for (indice = primero; indice !=null; indice = indice.enlace){
            if (destino == indice.dato){
                return indice;
            }
        }
        return null;
    }


    public Lista insertarLista(int testigo, int entrada){ //testigo = valor a buscar en el nodo de la lista
        Nodo nuevo, anterior;
        anterior = buscarLista(testigo);
        if (anterior != null){
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }







}







