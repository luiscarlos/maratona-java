package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime1 {
    private String nome;
    private String tipo;
    private String episodio;
    private String genero;
    private String studio;




    public Anime1(String nome, String tipo, String episodio, String genero, String studio) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
        this.studio = studio;

    }

    public Anime1() {
        System.out.println("Construtor vazio");
    }




    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEpisodio() {
        return episodio;
    }

    public String getGenero() {
        return genero;
    }


    public void imprimir() {
        System.out.println("Anime{" +
                "nome='" + nome +
                ", tipo='" + tipo +
                ", episodio='" + episodio  +
                ", genero='" + genero );

    }
}
