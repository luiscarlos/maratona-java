package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario1 {
    private String nome ;
    private int idade;
    private double salarios[];
    private double media;

    public Funcionario1() {
    }

    public Funcionario1(double media, double[] salarios, int idade, String nome) {
        this.media = media;
        this.salarios = salarios;
        this.idade = idade;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprimirDados(){
        System.out.println("O nome e: " + this.nome);
        System.out.println("A idade é: " + this.idade);

        if(salarios == null){
            return;
        }else {
            for(double salario: salarios){
                System.out.printf( "O salario é: R$  %.2f " , salario);
            }
        }
        imprimirMedia();
    }

    public void imprimirMedia(){
        if(salarios == null){
           return;
        }
        for(double salario: salarios){
            media += salario;
        }
        System.out.printf( "A média é: R$  %.2f " , media / salarios.length);
    }
}
