/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package swithr;

/**
 *
 * @author juan bonilla
 */
public class Swithr {

    public static void main(String[] args) {
      
       int day0fWeek=6;
       
           if (day0fWeek==1) {
                System.out.println("lunes de comedia" ); // 

            } else if (day0fWeek==2) {
                System.out.println("martes de drama " );
            } else if (day0fWeek==3) {
                System.out.println(" miercoles de accion " );
            } else if (day0fWeek==4) {
                System.out.println("jueves de animadas " );
            }else if (day0fWeek==5) {
                System.out.println("viernes de terror " );
            }else if (day0fWeek==6) {
                System.out.println("sabado de documentales" );
            }else if (day0fWeek==7) {
                System.out.println("Domingo de comidin");
            }else {
                System.out.println("¿En que dia vives?" );
            }
           
           System.out.println("------------------------------------------");
           
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
