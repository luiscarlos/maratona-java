package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Animej {
    private String nome;
    private static int[] episodios;

    static{
        System.out.println("Dentro do bloco de inicialização ");
    }
    public Animej(String nome) {
        this.nome = nome;
    }

    public Animej() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++)
            episodios[i] = i + 1;

        // imprime os episódios
        for (int ep : episodios) {
            System.out.print(ep + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
