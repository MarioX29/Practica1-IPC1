/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laberinto;
import java.util.Scanner;
/**
 *
 * @author MarioX27
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
    // TODO code application logic here
                //Llamada a las clases
        Mapa tbl=new Mapa();
        Mecanicas Mec =new Mecanicas();
        
        
       //Menu de opciones para el jugador
       Scanner sc= new Scanner(System.in);
       int op;
       
       do
           
       {
           System.out.println("1.-Jugar");
           System.out.println(" 2.-Crear Mapa");
           System.out.println("  3.-Reportes");
           System.out.println("   4.-Visualizar Mapa");
           System.out.println("    5.-Salir");
           op=sc.nextInt();
           
           switch (op){
               case 1: //Jugar mapa por defecto
               {
                 if(Mec.turno!=1){
                 Mec.Acciones(tbl.MapaDefault(), tbl.FJ(tbl.MapaDefault()), tbl.CJ(tbl.MapaDefault()));
                 }
                 else if(Mec.turno!=0){
                 Mec.Bot(tbl.MapaDefault(),tbl.FB(tbl.MapaDefault()),tbl.CB(tbl.MapaDefault()));
                 }
                       
               }      
                   break;
               case 2: 
                   
                   //Crear mapa
                     tbl.Crear();
                     
                   break;
               case 3:
                   //Reportes
                   
                   break;
               case 4:
                   
                   //Se le muestra el mapa al jugador
                   Mec.impmapa(tbl.MapaDefault());
                   break;
               case 5:
                   System.out.println("Cerrando...");
                       break;
                       
                           
               default:
                   System.out.println("Opcion incorrecta");
           }
           
    } while(op!=5);
    }
    
}
