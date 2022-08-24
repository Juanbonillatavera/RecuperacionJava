/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getsetter;

/**
 *
 * @author juan bonilla
 */
public class movie {
        
    //* classe 
    String name;
    String genre;
    int duration;
    //* gether

    public String getName() {
        return "This is the movie"+ name; // usando el get puedo agregar esta impresion sin tener que hacerlo en cada print
    }

    public String getGenre() {
        return "This is the genre"+genre;
    }

    public int getDuration() {
        return  duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
