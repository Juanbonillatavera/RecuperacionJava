/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package herencia2;

/**
 *
 * @author juan bonilla
 */
public class Herencia2 {

    public static void main(String[] args) {
       movie Red = new movie(true,"it","accion",120); // aqui insertamos los datos 
       Red.setName("red");
       Red.setGenre("accion");// metodo de la pelicula
       Red.setWonOscar(true);
       
      series avatar = new series(); // al agregar metodos constructor se espera que se inserten los datos para saber que datos exige puede ver el bombillo
      avatar.setName("avatar");  
      avatar.setGenre("fantasia");
      avatar.setTotalEpisodes(30);
      avatar.setTotalSeason(4);
      
        System.out.println(avatar.toString()); // imprimir datos
        
    }
  
    }

