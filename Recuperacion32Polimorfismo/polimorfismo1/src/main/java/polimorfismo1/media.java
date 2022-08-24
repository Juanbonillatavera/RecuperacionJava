/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo1;

/**
 *
 * @author juan bonilla
 */
public class media {  // clase padre que hereda sus metodos a las demas clases
    private String name; // con private negamos el acceso a estas variables si desean usarlas deben utilizar los get o setter
    private String genre;
    private int duration;   // metodos que hereda

    public media(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public void play() {  //creacion del metodo playmovie
        printSomething("playing" + name);
        
    }
    public void pause() {  //creacion del metodo playmovie

        printSomething("Movie paused" + name);
    }
    public void moveForward(int minutes){
        printSomething("moving forwand"+""+minutes);
    }
    private void printSomething(String something){ //metodo privado 
        System.out.println(something);
    }
    public String toString() { // metodo to string nos permite imprimir esto automaticamente sin tener que digitarlo
        return "The movie is:" + name + ",and the genre is," + genre + ", and it's duration is" + duration;
    
    
}
}

