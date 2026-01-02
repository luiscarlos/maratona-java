package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Marcos");
        Professor prof2 = new Professor("Andre");
        Professor prof3 = new Professor("Bruno");
        Escola esc = new Escola("Poeta");


        //Professor[] lista = {prof1, prof2, prof3};
        Professor[] lista =  new Professor[]{prof1, prof2, prof3};
        Escola esc1 = new Escola("Poeta", lista);

        esc.setProfessor(lista);

        esc.imprimir();


    }
}
