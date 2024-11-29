/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trees;

/**
 *
 * @author jesusrrp
 */

import java.util.Scanner;

public class Trees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        AVLTree avlTree = new AVLTree();
        BTree bTree = new BTree();
        NaryTree naryTree = new NaryTree();
        int mainOption;

        do {
            System.out.println("\n===== Menú Principal =====");
            System.out.println("1. Operar en Árbol Binario");
            System.out.println("2. Operar en Árbol AVL");
            System.out.println("3. Operar en Árbol B");
            System.out.println("4. Operar en Árbol N-ario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            mainOption = scanner.nextInt();

            switch (mainOption) {
                case 1:
                    binaryTreeMenu(binaryTree, scanner);
                    break;
                case 2:
                    avlTreeMenu(avlTree, scanner);
                    break;
                case 3:
                    bTreeMenu(bTree, scanner);
                    break;
                case 4:
                    nAryTreeMenu(naryTree, scanner); 
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        } while (mainOption != 0);

        scanner.close();
    }

    private static void binaryTreeMenu(BinaryTree binaryTree, Scanner scanner) {
        int option;
        do {
            System.out.println("\n===== Menú Árbol Binario =====");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar (Inorden, Preorden, Postorden)");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Inserta un valor para el Árbol Binario: ");
                    int valueBT = scanner.nextInt();
                    binaryTree.insert(valueBT);
                    System.out.println("Valor insertado en Árbol Binario.");
                    break;
                case 2:
                    System.out.print("Inserta un valor a eliminar del Árbol Binario: ");
                    int deleteBT = scanner.nextInt();
                    binaryTree.delete(deleteBT);
                    System.out.println("Valor eliminado del Árbol Binario.");
                    break;
                case 3:
                    System.out.println("\nÁrbol Binario en Inorden:");
                    binaryTree.dispararInorden();
                    System.out.println("\nÁrbol Binario en Preorden:");
                    binaryTree.dispararPreorden();
                    System.out.println("\nÁrbol Binario en Postorden:");
                    binaryTree.dispararPostOrden();
                    break;
                case 0:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        } while (option != 0);
    }

    private static void avlTreeMenu(AVLTree avlTree, Scanner scanner) {
        int option;
        do {
            System.out.println("\n===== Menú Árbol AVL =====");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Inserta un valor para el Árbol AVL: ");
                    int valueAVL = scanner.nextInt();
                    avlTree.insert(valueAVL);
                    System.out.println("Valor insertado en Árbol AVL.");
                    System.out.println("Árbol AVL actualizado:");
                    avlTree.printTree();
                    break;
                case 2:
                    System.out.print("Inserta un valor a eliminar del Árbol AVL: ");
                    int deleteAVL = scanner.nextInt();
                    avlTree.delete(deleteAVL);
                    System.out.println("Valor eliminado del Árbol AVL.");
                    System.out.println("Árbol AVL actualizado:");
                    avlTree.printTree();
                    break;
                case 3:
                    System.out.println("Árbol AVL:");
                    avlTree.printTree();
                    break;
                case 0:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        } while (option != 0);
    }

   private static void bTreeMenu(BTree bTree, Scanner scanner) {
        int option;
        do {
            System.out.println("\n===== Menú Árbol B =====");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Inserta un valor para el Árbol B: ");
                    int valueB = scanner.nextInt();
                    bTree.add(valueB);
                    System.out.println("Valor insertado en Árbol B.");
                    System.out.println("Árbol B actualizado:");
                    bTree.display(BTree.root, 1);
                    break;
                case 2:
                    System.out.print("Inserta un valor a eliminar del Árbol B: ");
                    int deleteB = scanner.nextInt();
                    bTree.delete(deleteB);
                    System.out.println("Valor eliminado del Árbol B.");
                    System.out.println("Árbol B actualizado:");
                    bTree.display(BTree.root, 1);
                    break;
                case 3:
                    System.out.println("Árbol B:");
                    bTree.display(BTree.root, 1);
                    break;
                case 0:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        } while (option != 0);
    }


    private static void nAryTreeMenu(NaryTree nAryTree, Scanner scanner) {
        int option;
        do {
            System.out.println("\n===== Menú Árbol N-ario =====");
            System.out.println("1. Insertar palabra");
            System.out.println("2. Buscar palabra");
            System.out.println("3. Imprimir árbol");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Ingresa la palabra a insertar: ");
                    String palabraInsertar = scanner.nextLine();
                    nAryTree.insertar(palabraInsertar);
                    System.out.println("Palabra insertada en el Árbol N-ario.");
                    break;
                case 2:
                    System.out.print("Ingresa la palabra a buscar: ");
                    String palabraBuscar = scanner.nextLine();
                    if (nAryTree.buscar(palabraBuscar)) {
                        System.out.println("La palabra \"" + palabraBuscar + "\" se encuentra en el Árbol N-ario.");
                    } else {
                        System.out.println("La palabra \"" + palabraBuscar + "\" no está en el Árbol N-ario.");
                    }
                    break;
                case 3:
                    System.out.println("Árbol N-ario:");
                    nAryTree.imprimirArbol();
                    break;
                case 0:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        } while (option != 0);
    }
}
