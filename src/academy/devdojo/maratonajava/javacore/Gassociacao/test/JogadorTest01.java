package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pele");
        Time time = new Time("Seleção Brasileira");


        j1.setTime(time);

        j1.imprimir();
    }
}
