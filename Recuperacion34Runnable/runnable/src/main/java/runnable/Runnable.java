/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package runnable;

import java.util.Scanner;

/**
 *
 * @author juan bonilla
 */
public class Runnable {

public static void main(String[] args) {
       
       
        movie Red = new movie(true,"it","accion",120); // aqui insertamos los datos 
      Red.setWonOscar(true);
      Red.dowloand();
       
      series avatar = new series(30,4,"avatar","fantasia",80); // al agregar metodos constructor se espera que se inserten los datos para saber que datos exige puede ver el bombillo
      series viking = new series(30,4,"viking","fantasia",80);
      
       
      media med= new media("batman","accion",120); // vamos a usar un ejemplo de encapsulamiento en la clase media con private
      //agregamos una synopsis a las series
      avatar.setSynopsis("Basada en un planeta extraterrestre en guerra con la tierra");
      viking.setSynopsis("Una serie de luchadores nordicos");
      // las insturcciones del menu
       System.out.println("Ingrese un numero del 1 al 2 para escoger la synopsis de las peliculas actuales");
       System.out.println("Ingrese 0 para salir del menu");
Scanner scanner= new Scanner(System.in);

int selection= scanner.nextInt();
// creamos un menu
while(selection !=0){
    System.out.println("\n");
    
    if (selection ==1){
        System.out.println(avatar.getSynopsis());
    }else if (selection ==2){
        System.out.println(viking.getSynopsis());
    }else{
        System.out.println("serie invalida,seleccione otra");
    }
}

      
      
    }
}

