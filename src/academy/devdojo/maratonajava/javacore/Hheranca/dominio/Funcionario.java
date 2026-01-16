package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class  Funcionario  extends Pessoa{
    private double salario;

    static{
        System.out.println("Dentro do bloco funcionario statico");
    }
    {
        System.out.println("Dentro do bloco funcionario 1");
    }
    {
        System.out.println("Dentro do bloco funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }


    public void imprimir(){
        super.imprimir();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorio(){
        System.out.println("Eu " + this.nome + " Recebi o salário de " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
