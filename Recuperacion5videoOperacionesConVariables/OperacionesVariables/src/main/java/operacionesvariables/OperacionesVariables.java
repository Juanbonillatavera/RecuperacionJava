/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operacionesvariables;

/**
 *
 * @author juan bonilla
 */
public class OperacionesVariables {

    public static void main(String[] args) {
        // rectangle 
        
        int b= 15; // asignacion de variable entero
        int a=8;
        
        
        // Area 
        int rArea = b*a; //podemos observar una operacion matemtica en este caso la multiplicacion
        
        //perimetro
        int rPerimeter= (2*b)+ (2*a);
        
        
        //triangulo
        b=5;
        a=3;
        
        //area
        int tArea=b*a/2;
        
        System.out.println("area rectangulo "+rArea); // aqui podemos observar los resultados de las operaciones
        System.out.println("el perimetro es "+rPerimeter);
        
    }
}
