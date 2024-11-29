/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trees;

/**
 *
 * @author jesusrrp
 */

import java.util.HashMap;
import java.util.Map;

public class NaryTree {
    private Nodo raiz;

    public NaryTree() {
        this.raiz = new Nodo('\0'); 
    }

    
    private class Nodo {
        char valor;
        Map<Character, Nodo> hijos;
        boolean esFinDePalabra;

        public Nodo(char valor) {
            this.valor = valor;
            this.hijos = new HashMap<>();
            this.esFinDePalabra = false;
        }
    }

    public void insertar(String palabra) {
        Nodo nodoActual = raiz;
        for (char c : palabra.toCharArray()) {
            nodoActual.hijos.putIfAbsent(c, new Nodo(c));
            nodoActual = nodoActual.hijos.get(c);
        }
        nodoActual.esFinDePalabra = true; 
    }

    public boolean buscar(String palabra) {
        Nodo nodoActual = raiz;
        for (char c : palabra.toCharArray()) {
            if (!nodoActual.hijos.containsKey(c)) {
                return false; 
            }
            nodoActual = nodoActual.hijos.get(c);
        }
        return nodoActual.esFinDePalabra; 
    }

    public void imprimirArbol() {
        imprimirNodo(raiz, 0);
    }

    private void imprimirNodo(Nodo nodo, int nivel) {
        for (Map.Entry<Character, Nodo> entrada : nodo.hijos.entrySet()) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("  "); 
            }
            System.out.println(entrada.getKey()); 
            imprimirNodo(entrada.getValue(), nivel + 1); 
        }
        if (nodo.esFinDePalabra) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            System.out.println("*"); 
        }
    }
}
