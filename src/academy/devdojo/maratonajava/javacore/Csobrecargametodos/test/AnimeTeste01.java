package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("NOME");

        anime.init("Pedro", "cinema", 13);
        anime.setGenero("Ação");

        //anime.init("Luis", "tv", 12, "Ação");

        anime.imprimi();
    }
}
