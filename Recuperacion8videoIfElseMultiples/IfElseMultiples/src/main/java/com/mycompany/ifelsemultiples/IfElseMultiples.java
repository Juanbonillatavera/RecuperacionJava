/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ifelsemultiples;

/**
 *
 * @author juan bonilla
 */
public class IfElseMultiples {

    public static void main(String[] args) {
              int tolalEpisodes=1; // variable asiganada
       
       if (tolalEpisodes>1 && tolalEpisodes<=10 ){  //aqui agregamos dos condiciones al if usando &&
           System.out.println("Es una miniserie");
        }else if (tolalEpisodes>10){  // podemos usar varios else if para agragar mas condiciones extras sino se cumple la primera
            System.out.println("Es una serie");
       }else if (tolalEpisodes==1){  // este se usa para indicar que si no se cumpla la anterior condicion imprima este mensaje
           System.out.println("Es una pelicula");
       }else{ // en caso de que ninguna de las anteriores condiciones sea verdadera imprimira este mensaje
           System.out.println("Debe tener al menos un episodio");
       }
    }
}
