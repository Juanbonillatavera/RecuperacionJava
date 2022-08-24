/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package arraystring;

/**
 *
 * @author juan bonilla
 */
public class ArrayString {

    public static void main(String[] args) {
        
        String[] movieTitleArray = new String[]{"up","titanic","Aladdin","Pepe el toro"}; // creamos un array String
        
        for (String title: movieTitleArray){ // colocamos los string en este metodo
            if(!title.contains("i")){ // con esto solo impriremos lo que contenga i
                System.out.println(title); 
            }
        }
    }
}
