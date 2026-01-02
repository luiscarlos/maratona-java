package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Romario");
        Jogador j2 = new Jogador("Cafu");
        Jogador j3 = new Jogador("Dunga");

        Jogador[] jogadores = new Jogador[]{j1,j2,j3};
        //Jogador[] jogadores1 = new Jogador[3]{j1,j2,j3};
        //Jogador[] jogadores2 = {j1,j2,j3};

        for(Jogador jog: jogadores){
            jog.imprimir();
        }
    }

}
