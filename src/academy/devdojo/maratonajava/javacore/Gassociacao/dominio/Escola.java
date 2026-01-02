package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professor;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void imprimir(){
        System.out.println("Escola: " + this.nome);
        if(professor == null) {
            return;
        }else{
            for (Professor prof: professor){
                System.out.println("Professor:" +prof.getNome());
            }
        }
    }




    public String getNome() {
        return nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }
}
