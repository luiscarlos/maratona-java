package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {

    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subitraiDoisNumeors(){
        System.out.println(10-2);
    }


    public void multiplicarDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDosNumeros(double num1, double num2){

        if(num2 == 0){
            return 0;

        }else{
            return num1 / num2;
        }

    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somarArray(int[] numero){
        int soma = 0;

        for(int num: numero){
           soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;

        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
