/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package polimorfismo1;

/**
 *
 * @author juan bonilla
 */
public class Polimorfismo1 {

 public static void main(String[] args) {
        movie Red = new movie(true,"it","accion",120); // aqui insertamos los datos 
       Red.setName("red");
       Red.setGenre("accion");// metodo de la pelicula
       Red.setWonOscar(true);
       
      series avatar = new series(30,4,"avatar","fantasia",80); // al agregar metodos constructor se espera que se inserten los datos para saber que datos exige puede ver el bombillo
      avatar.setName("avatar");  
      avatar.setGenre("fantasia");
      avatar.setTotalEpisodes(30);
      avatar.setTotalSeason(4);
      
       
      media med= new media("batman","accion",120); // vamos a usar un ejemplo de encapsulamiento en la clase media con private
      
      String title= med.getName(); // usando el get podemos llamar los datos que se encuentran privados
      String genre = med.getGenre();
        
      med.play(); // llamamos el play que a su vez llama el metodo privado printSomething
      
      med.moveForward(20); //llamamos a la impresion que acabamos de crear gracias al polimorfismo podemos personalizar la personalizacion de cada clase
      System.out.println(avatar.getduration());
      
    }
}
