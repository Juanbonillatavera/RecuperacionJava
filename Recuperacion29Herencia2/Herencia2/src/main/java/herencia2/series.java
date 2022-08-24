/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

/**
 *
 * @author juan bonilla
 */
public class series extends media{ // clase hija de media

    public series(int totalEpisodes, int totalSeason, String name, String genre, int duration) {  super(name, genre, duration);
        this.totalEpisodes = totalEpisodes;     
        this.totalSeason = totalSeason;
    }

    public int getTotalEpisodes() {
        // metodos
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public int getTotalSeason() {
        return totalSeason;
    }

    public void setTotalSeason(int totalSeason) {
        this.totalSeason = totalSeason;
    }
    
    int totalEpisodes;
    int totalSeason;
    
}

