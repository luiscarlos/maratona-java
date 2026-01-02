package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario1;

public class FuncionarioTest2 {
    public static void main(String[] args) {
        Funcionario1 funcionario1 = new Funcionario1();
        funcionario1.setNome("luis") ;
        funcionario1.setIdade(15) ;
        funcionario1.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario1.imprimirDados();
    }
}
