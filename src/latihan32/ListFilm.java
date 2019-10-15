/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan32;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class ListFilm {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film : "+filmName);
        System.out.println("Genre Film : "+filmGenre);
        System.out.println("Rating Film : "+filmRating);
        System.out.println("Duration Film : "+filmDuration+" Menit\n");
    }
    
}
