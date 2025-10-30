package academy.devdojo.maratonajava.javacore.Aintroducaoclass.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Estudante;

public class PessoaTest02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome ="Luis";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

    }
}
