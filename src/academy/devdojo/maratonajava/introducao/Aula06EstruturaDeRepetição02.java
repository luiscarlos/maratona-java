package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição02 {


    public static void main(String[] args) {

        for(int i = 0; i <= 100; i+=2){
            System.out.println(i);
            System.out.println("numero par");

        }


        System.out.println("===========================================");

        for(int i = 1; i <= 100; i+=2){
            System.out.println(i);
            System.out.println("numero impar");

        }


        System.out.println("===========================================");
        for(int i = 1; i <= 100; i++){
            if(i%2 == 0){
                System.out.println("numero par");
            }else{
                System.out.println("numero impar");
            }


        }

    }
}