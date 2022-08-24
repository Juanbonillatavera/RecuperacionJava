/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operacioncomplejas;

/**
 *
 * @author juan bonilla
 */
public class OperacionComplejas {

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
        double tArea=b*a/2;
        
        //Circle
        int r=60;
        
        //area
        
        double pi = 3.1416;             // podemos obervar por primerza vez la libreria math que permite
        double cArea=pi*Math.pow(r, 2);  // realizar operaciones matemiticas complejas en este caso el area de un circulo 
        
        System.out.println("la area de un circulo" + cArea);
        
        //triangle
        b=5;
        a=3;
        
        double sumaCatetos= Math.pow(b, 2); // la hipotenusa hallada usando la libreria math
        double area = Math.sqrt(sumaCatetos);
        
        System.out.println("area del triangulo "+area);
        
        
    }
}
