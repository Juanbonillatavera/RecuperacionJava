/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package argumentosmetodos;

/**
 *
 * @author juan bonilla
 */
public class ArgumentosMetodos {

    public static void main(String[] args) {

        String[] titleArray = new String[]{"up", "titanic", "Aladdin", "Pepe el toro"}; // creamos un array donde almacenaremos el nombre de las peliclas
        play(titleArray, 10); // le asignamos el valor al index
// al ser metodos locales se dejan de esta forma
        System.out.println("");
        pause();
    }

    public static void play(String[] titleArray, int index) {  //creacion del metodo playmovie

        if (index < titleArray.length) {  // creamos una validacion para proteger el metodo en caso de que el index se mas grande que el tamaño del array
            String title = titleArray[index];

            for (int i = 0; i < 10; i++) { // condicion y contador
                System.out.println("Playing movie..." + title);
            }

        } else {
            System.out.println("Index is too big"); // en el caso que el index sea mas grande imprime esto
        }
    }
    

    public static void pause() {
        System.out.println("Movie paused");
    }

}       
