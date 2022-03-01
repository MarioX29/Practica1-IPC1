/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberinto;
import java.util.Scanner;
/**
 *
 * @author MarioX27
 */
    

public class Mapa {
      public String [][] MD;
    //Matriz del mapa por defecto(principal)
    Scanner sc = new Scanner(System.in);
     public String[][] MapaDefault (){
      String[][] MD = {
                  {"#","#","#","#","#","#","#","#","S","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
                  {"S","O","O","O","O","O","O","#","O","O","O","O","O","O","O","O","O","#","O","O","O","O","O","O","O","O","#","O","O","S"},
                  {"#","#","#","#","#","#","O","O","#","#","#","O","#","#","#","O","#","O","O","#","#","#","#","#","#","O","O","#","O","#"},
                  {"#","O","O","G","O","#","O","#","G","G","#","O","#","G","#","O","#","G","#","O","#","O","O","O","#","#","O","O","O","#"},
                  {"#","O","#","#","O","#","O","O","O","O","#","G","#","O","#","O","#","#","O","O","#","O","#","O","O","#","O","#","O","#"},
                  {"#","G","#","O","O","#","O","#","#","#","#","#","#","O","#","O","O","O","#","O","#","O","#","#","#","#","O","#","O","#"},
                  {"#","O","#","#","O","O","O","O","O","O","#","O","#","O","O","O","O","O","O","O","O","O","#","O","O","O","O","#","#","#"},
                  {"#","#","O","O","O","#","O","#","O","#","O","O","#","#","O","#","#","O","#","#","#","#","#","O","#","O","#","#","G","#"},
                  {"#","O","O","#","O","#","O","O","O","#","O","#","O","#","O","O","#","O","#","O","O","O","O","O","#","O","O","#","G","#"},
                  {"#","O","#","#","O","#","#","#","O","#","O","#","O","#","#","O","#","O","#","#","#","O","#","#","#","#","G","#","O","#"},
                  {"#","O","O","O","O","#","O","#","O","#","O","#","O","#","O","O","#","O","O","G","#","O","O","#","O","#","O","#","O","#"},
                  {"#","#","#","G","#","O","O","O","O","#","O","#","O","#","#","O","#","#","#","#","#","O","#","O","O","O","O","#","O","#"},
                  {"#","J","O","#","O","O","#","#","#","O","O","#","O","#","O","O","O","O","O","O","O","O","O","O","O","#","O","#","O","#"},
                  {"#","#","O","#","#","O","#","O","O","#","O","#","O","O","O","#","O","#","#","O","#","O","O","#","O","#","O","#","O","#"},
                  {"#","O","O","#","O","O","#","O","#","#","O","#","G","#","B","#","#","O","O","#","O","O","#","O","O","#","O","#","O","#"},
                  {"#","#","O","#","#","O","O","O","G","#","O","#","#","#","O","#","O","O","O","O","O","#","O","O","#","#","O","#","O","#"},
                  {"#","O","O","#","O","O","#","O","#","#","O","O","#","O","O","#","O","#","#","#","#","#","O","#","O","#","G","#","O","#"},
                  {"#","#","O","O","O","#","#","#","O","#","O","#","O","#","O","O","O","#","G","O","O","O","O","O","O","O","#","#","O","#"},
                  {"#","G","#","O","#","O","O","O","O","#","O","O","#","#","#","#","#","#","#","#","#","#","#","#","#","O","O","O","O","#"},
                  {"#","G","#","O","O","O","#","#","O","O","O","O","O","G","O","O","O","G","O","O","O","G","O","O","#","#","O","#","O","#"},
                  {"#","O","#","#","#","#","#","O","O","#","#","#","#","#","#","#","#","#","#","#","#","#","#","O","O","#","O","#","#","#"},
                  {"#","O","#","O","O","O","#","O","#","O","O","O","O","O","O","O","O","O","O","O","O","O","O","#","O","#","O","O","O","S"},
                  {"#","O","O","O","#","O","#","O","O","#","O","#","#","#","#","#","#","O","#","#","#","O","O","O","O","#","O","#","#","#"},
                  {"#","#","#","#","#","O","#","O","#","O","O","#","G","O","O","O","#","O","O","O","#","O","#","#","#","#","O","#","O","#"},
                  {"#","O","#","O","O","O","#","O","G","#","O","#","#","#","#","O","#","#","#","O","#","O","O","O","O","#","O","O","O","#"},
                  {"#","O","#","#","#","O","#","#","#","#","O","#","O","O","O","O","#","G","#","O","#","#","#","O","#","G","#","#","O","#"},
                  {"#","O","#","O","O","O","O","O","O","O","O","O","O","#","O","O","#","O","#","O","O","O","O","O","#","O","#","O","O","#"},
                  {"#","O","#","#","#","#","#","#","#","#","#","O","#","O","#","#","#","O","#","O","#","#","#","#","#","O","O","O","#","#"},
                  {"#","O","O","O","O","O","G","#","O","O","O","O","#","O","O","O","O","O","O","O","O","O","O","O","O","O","#","O","G","#"},
                  {"#","#","#","#","#","#","#","#","#","#","#","#","#","S","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
      
      
      };
         
        return MD;
}
     
    public static void Crear(){
        Scanner sc= new Scanner(System.in);
        int Filas=0;
        int Colum=0;
        System.out.println("Ancho del mapa");
        Filas=sc.nextInt();
        System.out.println("Largo del mapa");
        Colum=sc.nextInt();
        
        String[][]Creado= new String[Filas][Colum];
        System.out.println("Puede empezar a crear el mapa");
           
        for (int i = 0; i < Filas; i++) {
            String l =sc.nextLine();
            for (int j = 0; j < Colum; j++) {
                Creado[i][j]=sc.nextLine();
            }
            System.out.println();
        }

    }
     
     
     /*Metodos para la posicion del jugador
     despues de una accion ingresada por el jugador
     */
         public int FJ(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("J")) {
                    fila = i;
                }
            }
        }
        return fila;
    }
    public int CJ(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("J")) {
                    fila = j;
                }
            }
        }
        return fila;
    }
   
     public int FB(String[][] matriz1) {
        int fila = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j].equals("B")) {
                    fila = i;
                }
            }
        }
        return fila;
    }
    public int CB(String[][] matriz1) {
        int fila = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j].equals("B")) {
                    fila = j;
                }
            }
        }
        return fila;
}
 
}
         
