/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package arrayloop;

/**
 *
 * @author juan bonilla
 */
public class ArrayLoop {

    public static void main(String[] args) {
        
        int[]epidodeDurationArray = new int []{30,32,27,31,60}; // creamos el arreglo y le asignamos parametros
        int n=epidodeDurationArray.length ; //longitud del areglo
        
        int seasonDuration=0; // contador
        
        for(int value:epidodeDurationArray){ //le creo un valor a cada elemento del areglo
            seasonDuration += value; // sumo ese valor a SeasonDuration
        }
        
        System.out.println("La temporada dura"+ seasonDuration );
    }
}
