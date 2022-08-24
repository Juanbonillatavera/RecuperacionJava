/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodotostring;

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

    public movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.duration = 0;
    }
    // otros constructores

    public movie(String name, String genre, int duration) { //el metodo constructor permite agregar los valores en una sola linea 
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public movie() { //el metodo constructor permite agregar los valores en una sola linea 
        this.name = "no name";
        this.genre = "no gnre";
        this.duration = 0;
    }

    public String getName() {
        return name; // usando el get puedo agregar esta impresion sin tener que hacerlo en cada print
    }

    public String getGenre() {
        return "This is the genre" + genre;
    }

    public int getDuration() {
        return duration;
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

    // para ordenar el codigo creamos los metodos en esta clase 
    public void play() {  //creacion del metodo playmovie

        System.out.println("Playing movie..." + name);
    }

    public void pause() {  //creacion del metodo playmovie

        System.out.println("Movie paused" + name);
    }

    // metodo para saber cuantos frames tiene la pelicula
    public int getTotalFrames() {
        return this.duration * 60 * 60;
    }
    
    public String toString(){ // metodo to string nos permite imprimir esto automaticamente sin tener que digitarlo
        return "The movie is:" + name + ",and the genre is,"+ genre + ", and it's duration is"+ duration ;
    }
}