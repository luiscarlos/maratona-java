package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class GerenciaSeminario {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Luis", 18);
        Aluno aluno2 = new Aluno("Bruno", 17);
        Local local = new Local("Rua 10");
        Seminario seminario1 = new Seminario("Programação", local);
        Seminario seminario2 = new Seminario("Logica");

        Aluno[] alunos = {aluno1, aluno2};
        seminario1.setAluno(alunos);
        seminario1.setEndereco(local);

        Professor prof1 = new Professor("I.A","Alexandre");
        Seminario[] seminarios = {seminario1};
        prof1.setSeminario(seminarios);


        System.out.println("----------- SEMINARIO ------------");
        seminario1.imprimir();


        System.out.println("----------- ALUNO1 ------------");
        aluno1.setSeminario(seminario1);
        aluno1.imprimir();

        System.out.println("----------- ALUNO2 ------------");
        aluno2.setSeminario(seminario2);
        aluno2.imprimir();


        System.out.println("----------- Professor ------------");
        prof1.imprimir();




    }
}
