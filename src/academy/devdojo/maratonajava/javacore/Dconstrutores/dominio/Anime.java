package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String episodio;
    private String genero;


    public Anime(String nome) {
        this.nome = nome;
    }

    public void init(String nome, String tipo, String episodio) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;

    }


    public void init(String nome, String tipo, String episodio, String genero) {
        this.init(nome, tipo, episodio);
        this.genero = genero;
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
