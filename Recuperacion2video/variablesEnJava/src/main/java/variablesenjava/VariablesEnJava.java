/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package variablesenjava;

/**
 *
 * @author juan bonilla
 */
public class VariablesEnJava {

    public static void main(String[] args) {
        
        
        System.out.println("Hola mundo soy programador java");
        int edad= 25;
        
        System.out.println("Mi edad es " + edad ); //primero declaramos la variable  y luego la impriminmos con conctanenacion usando +
        
        float altura= 1.83f; // float tipo de dato decimal
        
        System.out.println("Mi altura es " + altura);
        
        double valorDePi= 3.141592221212211; // double tambien es usado para guardar mas  numeros decimales
        
        System.out.println("El valor de pi es " + valorDePi);
        
        long distanciaAlSol= 7278228282828828282L; //long es usado para guardar grandes numeros
        
        System.out.println("La distancia al sol es "+distanciaAlSol);
        
        boolean isDay=false; // boolenano representa si o no tambien falso o verdadero
        System.out.println("Es de dia "+ isDay);
        
        char miInicial='e';// usado para almacenar caracteres pequeños
        
        System.out.println("La inicial de mi nombre es " + miInicial);
    }
}
