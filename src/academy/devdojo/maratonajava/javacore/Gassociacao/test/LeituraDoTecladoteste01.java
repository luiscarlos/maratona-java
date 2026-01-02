package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

import java.util.Scanner;

public class LeituraDoTecladoteste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um jogador 1:");
        String nomeJogador1 = entrada.nextLine();

        System.out.println("Digite um jogador 2:");
        String nomeJogador2 = entrada.nextLine();

        System.out.println("Digite um jogador 3:");
        String nomeJogador3 = entrada.nextLine();

        System.out.println("Digite o nome do time:");
        String nomeTime = entrada.nextLine();

        Jogador jog1 = new Jogador(nomeJogador1);
        Jogador jog2 = new Jogador(nomeJogador2);
        Jogador jog3 = new Jogador(nomeJogador3);

        Jogador[] jogadores = {jog1, jog2};
        Time time = new Time(nomeTime);
        time.setJogadores(jogadores);


        Time time1 = new Time(nomeTime);
        jog3.setTime(time1);

        System.out.println("---- jogador ----");
        jog3.imprimir();


        System.out.println("---- time ----");
        time.imprinir();
    }
}
