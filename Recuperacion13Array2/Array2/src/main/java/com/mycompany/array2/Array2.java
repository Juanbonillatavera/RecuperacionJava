/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array2;

import java.util.Scanner;

/**
 *
 * @author juan bonilla
 */
public class Array2 {

    public static void main(String[] args) {
                  System.out.println("Escribe el numero de episodio que quieras saber su duracion la serie solo tiene 5 episodios");
         Scanner scanner= new Scanner(System.in); 
         
         int episodeIndex=  scanner.nextInt();
         
         int [] episodeDurationArray= new int[5]; // creacion del array con 5 elementos
         int n= episodeDurationArray.length; // se crea una variable con la longitud del areglo para no tener que cambiar el numero de episodios en la impresion  
         
         episodeDurationArray [0]= 30; // los array siempre inician en 0
         episodeDurationArray [1]= 32;
         episodeDurationArray [2]= 27;
         episodeDurationArray [3]= 31;
         episodeDurationArray [4]= 60;
         
         if (episodeIndex>=0 && episodeIndex<5){ // validacion para determinar el rango entre 0 y 5 para evitar errores
             int episodeDuration= episodeDurationArray[episodeIndex]; 
             System.out.println("El episodio dura " + episodeDuration + "minutos");
         }else{
             System.out.println("Error,la serie solo tiene"+ n + "episodios");
         }
          }
}
