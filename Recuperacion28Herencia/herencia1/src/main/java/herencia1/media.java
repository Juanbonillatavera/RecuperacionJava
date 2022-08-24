/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

/**
 *
 * @author juan bonilla
 */
public class media {  // clase padre que hereda sus metodos a las demas clases
     String name;
    String genre;
    int duration;   // metodos que hereda

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

        System.out.println("Playing movie..." + name);
    }
    public void pause() {  //creacion del metodo playmovie

        System.out.println("Movie paused" + name);
    }
    public String toString() { // metodo to string nos permite imprimir esto automaticamente sin tener que digitarlo
        return "The movie is:" + name + ",and the genre is," + genre + ", and it's duration is" + duration;
    
    
}
}