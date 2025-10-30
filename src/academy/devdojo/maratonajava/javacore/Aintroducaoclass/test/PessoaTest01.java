package academy.devdojo.maratonajava.javacore.Aintroducaoclass.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Estudante;

public class PessoaTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome ="Luis";
        estudante.idade = 15;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
