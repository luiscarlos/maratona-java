package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Luis");
        list.add("Pedro");
        list.add("Bruno");
        list.add("Marcos");
        System.out.println(list);

    }
}
