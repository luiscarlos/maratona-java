package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();
        System.out.println("Finalizando calculadora teste ");
        calculadora.somarDoisNumeros();
        System.out.println("------------------------------");
        System.out.println("Função subtrair");
        calculadora.subitraiDoisNumeors();
        System.out.println("------------------------------");
        System.out.println("Multiplicar");
        calculadora.multiplicarDoisNumeros(2,2);



    }
}
