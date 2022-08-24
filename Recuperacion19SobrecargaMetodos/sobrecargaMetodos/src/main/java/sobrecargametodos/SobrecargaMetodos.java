/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sobrecargametodos;

import java.util.Random;

/**
 *
 * @author juan bonilla
 */
public class SobrecargaMetodos {

    public static void main(String[] args) {
            String[] titleArray = new String[]{"up", "titanic", "Aladdin", "Pepe el toro"}; // creamos un array donde almacenaremos el nombre de las peliclas
        String title=play(titleArray, 3); // le asignamos el valor al index
         String title2=play(titleArray); // titulo del segundo metodo
// al ser metodos locales se dejan de esta forma
        System.out.println("");
        pause(title);
        System.out.println("");
        pause(title2); // impresion pausa del segundo metodo
    }

    public static String play(String[] titleArray, int index) {  //creacion del metodo playmovie

        if (index < titleArray.length) {  // creamos una validacion para proteger el metodo en caso de que el index se mas grande que el tamaño del array
            String title = titleArray[index];

            for (int i = 0; i < 10; i++) { // condicion y contador
                System.out.println("Playing movie..." + title);
            }
            return title; // regresamos el titulo de la pepicula para dar una sensacion de carga
        } else {
            System.out.println("Index is too big"); // en el caso que el index sea mas grande imprime esto
            return ""; // en caso de error imprime esto
        }
    }
     //metodo sobrecargado
     public static String play(String[] titleArray) {   //creacion del metodo para reproducir pelicula aleatoria
     Random Aleatorio = new Random();// Generar aleatoriamente
     int index = Aleatorio.nextInt(titleArray.length-1);
     String title = titleArray[index];
     
     for(int i = 0; i<10; i++){
             System.out.println("Playing movie: "+ title);
         }
     return title;
    }

    public static void pause(String title) {
        if(title.isEmpty()){ // validacion en caso de estar vacio
            System.out.println("No movie playing"); // en caso de error y no encontrar una pelicula imprimira esto
        }
        System.out.println("Movie paused"+ title);
    }
    }

