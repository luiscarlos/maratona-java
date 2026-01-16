package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media ;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double[] salarios, double media) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
        this.media = media;
    }



    public void imprimirDados() {
        System.out.println("O nome é: " + nome);
        System.out.println("A idade é: " + idade);

        if(salarios == null){
            return;
        }else {
            for(double salario: salarios){
                System.out.printf( "O salario é: R$  %.2f " , salario);
            }
        }
        imprimirMedia();
    }

    public void imprimirMedia() {
        if(salarios == null){
            return;
        }
            for(double salario: salarios){
                media += salario;
            }
            System.out.printf( "O salario é: R$  %.2f " , media / salarios.length);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
