package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bruno");
        pessoa. setIdade(-1);

        pessoa.imprimir();

        System.out.println("------------------");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
