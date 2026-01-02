package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Bruno");
        Jogador jog2 = new Jogador("Marcos");
        Jogador jog3 = new Jogador("Luis");

        Jogador[] jogadores = {jog1, jog2,jog3};

        Time time = new Time("Brasil");
        time.setJogadores(jogadores);

        time.imprinir();

        System.out.println("------------------------");


        Jogador jog4 = new Jogador("Sales");
        Jogador jog5 = new Jogador("gg");
        Jogador jog6 = new Jogador("Thiago");
        Time t1 = new Time("Alemanha");
        Time t2 = new Time("França");
        Jogador[] jogadores1 = {jog4, jog5};



        jog4.setTime(t1);
        jog5.setTime(t1);
        jog6.setTime(t2);


        t1.setJogadores(jogadores1);

        System.out.println("--- JOGADOR ---");
        jog4.imprimir();
        System.out.println("--- TIME ---");
        t1.imprinir();
        System.out.println("____________________");
        jog6.imprimir();













    }
}
