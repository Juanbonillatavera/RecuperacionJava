/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package metodo;

/**
 *
 * @author juan bonilla
 */
public class Metodo {

    public static void main(String[] args) { // metodo principal donde se ejecutara el programa
        playMovie(); // al ser metodos locales se dejan de esta forma
        System.out.println("");
        pause();
    }
    public static void playMovie (){  //creacion del metodo playmovie
    
    for(int i=0;i<10;i++){ // condicion y contador
        System.out.println("Playing movie...");
        
    }
        
    }
    public static void pause (){
        System.out.println("Movie paused");
    }
}
