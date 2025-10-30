package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaConticional2 {


    public static void main(String[] args) {


        byte dia = 4;

        //char, int,byte,short,enum,String
        switch (dia) {
            case 1:
                System.out.println("Domingo dia: " + dia + " É final de semana");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("numero incorreto");
        }


        // ou


        switch (dia) {
            case 1:
            case 7:
                System.out.println(" É final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Não é final de semana ");
                break;

            default:
                System.out.println("numero incorreto");
        }
    }
}
