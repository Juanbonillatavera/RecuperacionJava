/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsleep;

/**
 *
 * @author juan bonilla
 */
public class movie extends media { // clase hija de media

    public movie(boolean wonOscar, String name, String genre, int duration) { super(name, genre, duration);
        this.wonOscar = wonOscar; // metodo consturtor super hereda las caracteristicas del padreS
    }
    // con este metodo podemos retornar localmente duration sin ir a media
    public int getduration(){
        return super.getDuration();
    }

    public boolean isWonOscar() {
        // metodos
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
    private boolean wonOscar;
}