package academy.devdojo.maratonajava.javacore.Aintroducaoclass.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Professor;

public class ProfessoTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome ="Luis";
        professor.idade = 15;
        professor.sexo = 'M';

        System.out.print("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
