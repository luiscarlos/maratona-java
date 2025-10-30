package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula06EstruturaDeRepetição01 {


    public static void main(String[] args) {


        int count = 0;

        while (count < 10) {
            System.out.println(count);
            System.out.println("dentro do whilw");
            count++;
        }

        count = 10;
        System.out.println("========================================");
        do {
            System.out.println("Dentro do DO WHILE");
        } while (count < 10);


        System.out.println("========================================");

        for(count = 0; count < 10; count++){
            System.out.println(count);
            System.out.println("Dentro do for " + count);
        }
    }
}