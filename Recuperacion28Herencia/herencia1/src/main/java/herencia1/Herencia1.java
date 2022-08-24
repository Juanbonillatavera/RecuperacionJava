/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package herencia1;

/**
 *
 * @author juan bonilla
 */
public class Herencia1 { // clase main donde se imprimira todo

    public static void main(String[] args) {
       movie Red = new movie(); // creacion de una pelicula
       Red.setName("red");
       Red.setGenre("accion");// metodo de la pelicula
       Red.setWonOscar(true);
       
      series avatar = new series(); // creacion de la series
      avatar.setName("avatar");  
      avatar.setGenre("fantasia");
      avatar.setTotalEpisodes(30);
      avatar.setTotalSeason(4);
      
        System.out.println(avatar.toString()); // imprimir datos
        System.out.println(Red.toString());
    }
}
