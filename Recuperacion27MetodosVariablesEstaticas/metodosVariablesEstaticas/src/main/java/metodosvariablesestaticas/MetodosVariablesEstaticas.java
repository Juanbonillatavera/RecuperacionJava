/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package metodosvariablesestaticas;

/**
 *
 * @author juan bonilla
 */
public class MetodosVariablesEstaticas {

    public static void main(String[] args) {
        
        movie toyStory = new movie("toy story", "familiar"); // con el construrtor no es necesario usar get setter permite hacer todo en una linea
        movie Red = new movie("Red", "accion", 180); // podemos usar varios constructores para establecer diferentes condiciones y agregarlas de una vez
        movie it = new movie();

        int totalFrames= movie.getTotalFrames(90); // con este metodo podemos transpasar problemas de compatiblidad
        System.out.println("totalFrames");
        
    }
    }

