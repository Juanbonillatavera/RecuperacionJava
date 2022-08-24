/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package metodosclases;

import java.util.Random;

/**
 *
 * @author juan bonilla
 */
public class MetodosClases {

    public static void main(String[] args) {
        movie toyStory = new movie("toy story", "familiar"); // con el construrtor no es necesario usar get setter permite hacer todo en una linea
        movie Red = new movie("Red", "accion", 180); // podemos usar varios constructores para establecer diferentes condiciones y agregarlas de una vez
        movie it = new movie();
        //llamamos los metodos para imprimir los datos
        Red.play();
        Red.pause();
        it.play();

        int itTotalframes = it.getTotalFrames();

        System.out.println("Total frames" + itTotalframes);
    }

}
