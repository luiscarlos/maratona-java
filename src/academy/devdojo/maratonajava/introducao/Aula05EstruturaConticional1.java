package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaConticional1 {


    public static void main(String[] args) {


        byte dia = 30;


        //char, int,byte,short,enum,String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
            default:
                System.out.println("numero incorreto");
        }



    String sexo ="M";
    switch(sexo){
        case "M":
            System.out.println("Sexta");
            break;
        case "F":
            System.out.println("Sexta");
        default:
            System.out.println("Já era");
    }
    }
}
