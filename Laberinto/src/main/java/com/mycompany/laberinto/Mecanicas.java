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
public class Mecanicas {
 
     int Oro =0;
     int movs=0;
     int filas;
     int columna; 
     int Error = 0;
    int turno=0;
     Mapa mapa = new Mapa();
    Scanner sc = new Scanner(System.in);
    public void Acciones(String[][] matriz, int filas, int columna ) {   
       
        while (Error < 3) {

                impmapa(matriz); 
    
                System.out.println("Accion:");
                String cara = sc.next();
   
                
                switch (cara) {
                    
                    case "oro":
                        System.out.println("Tienes "+Oro+" de oro");
                         turno=turno+1;
                                     
                        break;
                    case "oro_r":
                        Ororeq(matriz,filas,columna);
                         turno=turno+1;
                                     
                        break;
                     case "w":
                        if (matriz[filas - 1][columna]!="#") {
                        matriz[filas - 1][columna] = "J";
                        System.out.println("Se ha realizado el movimiento");   
                        movs=movs+1;
                         turno=turno+1;
                        matriz[filas][columna] = "O"; 
                       
                        filas--;
                    } else {
                        Error++;
                        System.out.println("Haz ingresado un comando incorrecto "+Error);
                        Oro--;
                    }
                         break;
                            case"s":
                            if (matriz[filas + 1][columna]!="#") {
                        matriz[filas + 1][columna] = "J";
                        System.out.println("Se ha realizado el movimiento");
                                 movs=movs+1;
                                 
                                 matriz[filas][columna] = "O";
                                 
                        matriz[0][8]="S";
                        filas++;
                    } else {
                        Error++;
                        System.out.println("Haz ingresado un comando incorrecto "+Error);
                          Oro--;
                    }
                           
                        break;
                    case ("d"):
                         if (matriz[filas][columna+ 1]!="#") {
                        matriz[filas][columna + 1] = "J";
                        System.out.println("Se ha realizado el movimiento");
                             movs=movs+1;
                             turno=turno+1;
                        matriz[filas][columna] = "O";
                       
                        matriz[1][0]="S";
                        columna++;
                    } else {
                        Error++;
                        System.out.println("Haz ingresado un comando incorrecto "+Error);
                         Oro--;
                    }                       
                        break;
                    case "a":
                        if (matriz[filas][columna - 1] !="#") {
                        matriz[filas][columna - 1] = "J";
                        turno=turno+1;
                        System.out.println("Se ha realizado el movimiento");
                         movs=movs+1;
                        matriz[filas][columna] = "O";
                        
                        columna--;
                    } else {
                        Error++;
                        System.out.println("No se ha realizado el movimiento"+Error); 
                         Oro--;
                    }                      
                        break;
                    case "l":
                       levantar(matriz,filas,columna);
                        turno=turno+1;
                        
                            break;
                 case"e":
                       //Salida 15 de 
                       salir(matriz,filas,columna);     
                       break;
                       case"m":
                           impmapa(matriz);
                           break;
                           
                                   
                    default:
                        System.out.println("Opcion no valida");
                        System.out.println("Haz ingresado un comando incorrecto "+Error);
                        Oro--;
                } 
            }
        }   
     public void impmapa(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
//     public void Mapa1(String[][] matriz) {
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                System.out.print(matriz[i][j] = "-");
//            }
//            System.out.println();
//        }
//     }
     public void salir(String matriz[][], int filas, int columna){
          if(matriz[filas][columna]!=matriz[1][0]&& matriz[filas][columna]!=matriz[0][8]&& matriz[filas][columna]!=matriz[29][13]&&matriz[filas][columna]!=matriz[1][29]&&matriz[filas][columna]!=matriz[21][29]){
                           System.out.print("no se puede ejecutar en esta posicion");
                               System.out.println(" ");
            }else //Salida 15 de oro
            if(Oro<15 && matriz[filas][columna]==matriz[1][0]){
                          
                         System.out.println("Oro Insuficiente");
                           System.out.println("Tienes"+Oro+"de oro");  
                            System.out.println("Vuelve mas tarde");
                                  matriz[filas][columna + 1] = "J";
                                    columna++;
                                  matriz[filas][columna-1] = "S";
                                  columna++;             
                          }
                       else  if(Oro<30 && matriz[filas][columna]==matriz[0][8]){
                          
                         System.out.println("Oro Insuficiente");
                           System.out.println("Tienes"+Oro+"de oro");  
                            System.out.println("Vuelve mas tarde");
                                  matriz[filas+1][columna] = "J";
                                    filas++;
                                  matriz[filas-1][columna] = "S";
                                  filas++;             
                          }else if(Oro<43 && matriz[filas][columna]==matriz[29][13]){
                          
                         System.out.println("Oro Insuficiente");
                           System.out.println("Tienes"+Oro+"de oro");  
                            System.out.println("Vuelve mas tarde");
                                  matriz[filas-1][columna] = "J";
                                    filas--;
                                  matriz[filas+1][columna] = "S";
                                  filas--;             
                          }else if(Oro<51 && matriz[filas][columna]==matriz[1][29]){
                          
                         System.out.println("Oro Insuficiente");
                           System.out.println("Tienes"+Oro+"de oro");  
                            System.out.println("Vuelve mas tarde");
                                  matriz[filas][columna-1] = "J";
                                    columna--;
                                  matriz[filas][columna+1] = "S";
                                  columna--;             
                          }else if(Oro<55 && matriz[filas][columna]==matriz[21][29]){
                          
                         System.out.println("Oro Insuficiente");
                           System.out.println("Tienes"+Oro+"de oro");  
                            System.out.println("Vuelve mas tarde");
                                  matriz[filas-1][columna] = "J";
                                    filas--;
                                  matriz[filas+1][columna] = "S";
                                  filas--;             
                          }
                          
                           else
                           { 
                               System.out.println("Haz Ganado");
                        System.out.println("Haz realizado"+movs+" movimientos en la partida");
                               System.out.println("Haz recolectado"+Oro+ "de oro en la partida");
                         Error +=3;
                           }
     
     }
     public void levantar(String[][]matriz,int filas,int columna){
         
        if(matriz[filas][columna]==matriz[15][8]||matriz[filas][columna]==matriz[11][3]||matriz[filas][columna]==matriz[9][26]||matriz[filas][columna]==matriz[8][28]){
                           System.out.println("Haz levantado 1 de oro");
                         Oro=Oro+1;
                            System.out.println("Tienes "+Oro+" de oro ");

                           }
                        else
        if(matriz[filas][columna]==matriz[4][11]||matriz[filas][columna]==matriz[14][12]||matriz[filas][columna]==matriz[19][17]||matriz[filas][columna]==matriz[17][18]||matriz[filas][columna]==matriz[10][19]){
                            System.out.println("Haz levantado 2 de oro");
                            Oro=Oro+2;
                            System.out.println("Tienes "+Oro+" de oro ");
        }
        else
          if(matriz[filas][columna]==matriz[5][1]||matriz[filas][columna]==matriz[24][8]||matriz[filas][columna]==matriz[3][9]||matriz[filas][columna]==matriz[23][12]||matriz[filas][columna]==matriz[19][21]){
                            System.out.println("Haz levantado 3 de oro");
                            Oro=Oro+3;
                            System.out.println("Tienes "+Oro+" de oro ");

          }else
              if(matriz[filas][columna]==matriz[16][26]){
                            System.out.println("Haz levantado 4 de oro");
                            Oro=Oro+4;
                            System.out.println("Tienes "+Oro+" de oro ");

          }else
              if(matriz[filas][columna]==matriz[18][1]||matriz[filas][columna]==matriz[3][3]||matriz[filas][columna]==matriz[3][13]||matriz[filas][columna]==matriz[3][17]||matriz[filas][columna]==matriz[25][25]){
                            System.out.println("Haz levantado 5 de oro");
                            Oro=Oro+5;
                            System.out.println("Tienes "+Oro+" de oro ");

          }else
                  if(matriz[filas][columna]==matriz[19][1]||matriz[filas][columna]==matriz[3][8]||matriz[filas][columna]==matriz[19][13]||matriz[filas][columna]==matriz[7][28]){
                            System.out.println("Haz levantado 7 de oro");
                            Oro=Oro+7;
                            System.out.println("Tienes "+Oro+" de oro ");

          }else
                 if(matriz[filas][columna]==matriz[28][6]){
                            System.out.println("Haz levantado 8 de oro");
                            Oro=Oro+8;
                            System.out.println("Tienes "+Oro+" de oro ");

          }else 
                if(matriz[filas][columna]==matriz[25][17]){
                            System.out.println("Haz levantado 9 de oro");
                            Oro=Oro+9;
                            System.out.println("Tienes "+Oro+" de oro ");  
          }
        else if(matriz[filas][columna]==matriz[28][28]){
                            System.out.println("Haz levantado 10 de oro");
                            Oro=Oro+10;
                            System.out.println("Tienes "+Oro+" de oro ");

          }else{
            System.out.print("no se puede ejecutar en esta posicion");
                               System.out.println(" ");


        }        
  }     
     public void Ororeq(String[][] matriz, int filas, int columna){
         
                        if(matriz[filas][columna]==matriz[1][0])
                        {System.out.println("Necesitas 15 de oro");
                        matriz[filas][columna + 1] = "J";
                        matriz[filas][columna] = "S";
                        columna++;}
                        else if(matriz[filas][columna]==matriz[0][8]){
                                System.out.println("Necesitas 30 de oro");
                        matriz[filas+1][columna] = "J";
                        matriz[filas][columna] = "S";
                        filas++;
                                }
                         else if(matriz[filas][columna]==matriz[29][13]){
                                System.out.println("Necesitas 43 de oro");
                        matriz[filas-1][columna] = "J";
                        matriz[filas][columna] = "S";
                        filas--;
                                }
                         else if(matriz[filas][columna]==matriz[1][29]){
                                System.out.println("Necesitas 51 de oro");
                        matriz[filas][columna-1] = "J";
                        matriz[filas][columna] = "S";
                        columna--;
                                }
                        else if(matriz[filas][columna]==matriz[21][29]){
                                System.out.println("Necesitas 55 de oro");
                        matriz[filas][columna-1] = "J";
                        matriz[filas][columna] = "S";
                        columna--;
                                }
     
     
     }    
     public void Bot(String[][] matriz, int filas, int columna) {
        String accion = "d";

         
        while (turno==1) {
            impmapa(matriz);
            switch (accion) {
                case "d":
   
                    if (matriz[ filas - 1][columna]!="#") {
                        matriz[filas - 1][columna] = "B";
                        matriz[filas][columna] = "O"; 
                        filas--;
                         
                        accion = "w";
                        
                    } else {
                        if (matriz[filas][columna + 1]!="#") {
                            matriz[filas][columna + 1] = "B";
                            matriz[filas][columna] = "O";
                            columna++;
                             
                        } else {
                            if (matriz[filas + 1][columna]!="#") {
                                matriz[filas + 1][columna] = "B";
                                matriz[filas][columna] = "O";
                                filas++;
                                 
                               accion = "s";
                            } else {
                                matriz[filas][columna - 1] = "B";
                                matriz[filas][columna] = "O";
                                columna--;
                                 
                                accion= "a";
                            }
                        }
                    }
                    break;
                case "w":
              
                    if (matriz[filas][columna - 1]!="#") {
                                matriz[filas][columna - 1] = "B";
                                matriz[filas][columna] = "O";
                                
                                columna--;
                                      
                                accion = "a";
                    } else {
                        if (matriz[filas - 1][columna]!="#") {
                            matriz[filas - 1][columna] = "B";
                            matriz[filas][columna] = "O";
                           
                            filas--;
                                  
                        } else {
                            if (matriz[filas][columna + 1]!="#") {
                                matriz[filas][columna+ 1] = "B";
                                matriz[filas][columna] = "O";
                               
                                columna++;
                                      
                                accion = "d";
                            } else {
                                matriz[filas + 1][columna] = "B";
                                matriz[filas][columna] = "O";
                           
                                filas++;
                                      
                                accion = "s";
                            }
                        }
                    }
                    break;
                case "a":
                
                    if (matriz[filas + 1][columna]!="#") {
                        matriz[filas + 1][columna] = "B";
                        matriz[filas][columna] = "O";
                        filas++;
                              
                        accion= "s";
                    } else {
                        if (matriz[filas][columna - 1] !="#") {
                            matriz[filas][columna - 1] = "B";
                            matriz[filas][columna] = "O";
                            columna--;
                               
                        } else {
                            if (matriz[filas - 1][columna]!="#") {
                                matriz[filas - 1][columna] = "B";
                                matriz[filas][columna] = "O";
                                filas--;
                                   
                                accion = "w";
                            } else {
                                matriz[filas][columna + 1] = "B";
                                matriz[filas][columna] = "O";
                                columna++;
                                    
                                accion = "d";
                            }
                        }
                    }
                    break;
                case "s":
             
                    if (matriz[filas][columna + 1]!="#") {
                        matriz[filas][columna + 1] = "B";
                        matriz[filas][columna] = "O";
                        columna++;
                               
                        accion = "d";
                    } else {
                        if (matriz[filas + 1][columna]!="#") {
                            matriz[filas + 1][columna] = "B";
                            matriz[filas][columna] = "O";
                            filas++;
                                  
                        } else {
                            if (matriz[filas][columna - 1] !="#") {
                                matriz[filas][columna - 1] = "B";
                                matriz[filas][columna] = "O";
                                columna--;
                                       
                                accion = "a";
                            } else {
                                matriz[filas - 1][columna] = "B";
                                matriz[filas][columna] = "O";
                                filas--;
                                       
                                accion = "w";
                            }
                        }
                    }
                    break;
                default:
                   System.out.println("");
           
        }
        impmapa(matriz);
        System.out.println("Haz sido atrapado");
    }

    
     
     
}
}
