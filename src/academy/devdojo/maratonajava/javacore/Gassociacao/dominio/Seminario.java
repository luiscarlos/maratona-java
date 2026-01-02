package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {

    private String titulo;
    private Aluno[] aluno;
    private Local local;




    public void imprimir(){
        System.out.println("Nome do seminário: " + this.titulo);
        System.out.println("O endereço é: " + this.local.getLocal());

        if(aluno == null ){
            return;
        }else{
            for(Aluno al: aluno){
                System.out.println( "Aluno: " + al.getNome());
            }
        }
    }
    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this.titulo = titulo;
        this.aluno = aluno;
        this.local = local;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public void setEndereco(Local local) {
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }
}
