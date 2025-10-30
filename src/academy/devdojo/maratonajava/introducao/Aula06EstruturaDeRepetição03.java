package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição03 {


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

        System.out.println("==================IMPRIMIR 50=========================");
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
            if(i >= 25) {
                break;
            }
        }

        System.out.println("==================IMPRIMIR 50 COM VARIAVEL=========================");
        int valorMax = 50;
        for(int i = 1; i <= valorMax; i++){
            if(i > 25) {
                break;
            }
            System.out.println(i);
        }

    }
}