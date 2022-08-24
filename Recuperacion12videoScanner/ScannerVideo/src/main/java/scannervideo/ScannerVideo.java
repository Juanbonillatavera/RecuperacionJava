/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package scannervideo;

import java.util.Scanner;

/**
 *
 * @author juan bonilla
 */
public class ScannerVideo {

    public static void main(String[] args) {
        
        System.out.println("¿Que dia de la semana es lunes=1.... domingo 7");
        Scanner scanner= new Scanner(System.in); // el scanner nos permite capturar los datos digitados por el usuario
              int day0fWeek=scanner.nextInt();
           // el switch nos da una mejor opcion para elaborar un menu al ser mas sencilla 
           switch(day0fWeek){
               case 1: System.out.println("lunes de comedia" ); // case es cada posibilidad de respuesta que tiene el menu si se toma la opcion 1 imprimira esta opcionn
               break; //rompe el cliclo en esta opcion para que el menu no se repita
               
                 case 2:System.out.println("martes de drama " ); // 
               break; 
               
                 case 3:  System.out.println(" miercoles de accion " ); // 
               break;
               
                 case 4:  System.out.println("jueves de animadas " ); // 
               break;
               
                 case 5: System.out.println("viernes de terror " ); // 
               break;
               
                 case 6:   System.out.println("sabado de documentales" ); // 
               break;
               
                 case 7:  System.out.println("Domingo de comidin"); // 
               break;
               
               default: // si no es seleccionado ninguno de los casos anteriores saltara esta impresion
                   System.out.println("¿En que dia vives?" );
           }
    }
}
