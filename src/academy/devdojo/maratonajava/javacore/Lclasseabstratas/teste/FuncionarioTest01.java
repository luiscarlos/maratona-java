package academy.devdojo.maratonajava.javacore.Lclasseabstratas.teste;


import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasseabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Mami", 5000);
        Desenvolvedor desenv = new Desenvolvedor("Luis", 4000);


        System.out.println(gerente);
        System.out.println(desenv);
    }
}
