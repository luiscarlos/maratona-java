package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public void imprimir(){
        System.out.println("Nome do professor é: " + this.nome);
        System.out.println("Sua especialidade é: " + this.especialidade);
        if(this.seminario == null){
            return;
        }else{
            for(Seminario semi: this.seminario){
                System.out.println("Seminário a ministrar: " + semi.getTitulo());
                if (semi.getLocal() != null) {
                    System.out.println("Local: " + semi.getLocal().getLocal());
                }else{
                    return;
                }if(semi.getAluno() == null || semi.getAluno().length == 0){
                    continue;
                }else{
                    for(Aluno aluno: semi.getAluno()){
                        System.out.println("Aluno matriculado: " + aluno.getNome() + " idade: " + aluno.getIdade());
                    }
                }


            }
        }
    }
}
