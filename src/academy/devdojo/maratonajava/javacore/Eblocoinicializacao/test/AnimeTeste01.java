package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;


import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("lui");

        System.out.println(anime.getEpisodios());
    }
}
