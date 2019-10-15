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
public class Latihan32 {
    public static ListFilm list = new ListFilm();
    public static void tmpl(String n,String g, double r, int d) {
        list.filmName = n;
        list.filmGenre = g;
        list.filmRating = r;
        list.filmDuration = d;
        list.nowPlaying();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==== Daftar film sedang tayang ====");
        System.out.println("");
        tmpl("Venom","Action, Horror, Scifi",8.5,120);
        tmpl("Small Foot","Animation",9.0,96);
        tmpl("Crazy Rich Asian","Comedy",7.8,119);
        tmpl("Asih","Horror",6.0,100);
    }
    
}
