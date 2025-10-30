package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais02 {

    public static void main(String[] args) {

        //byte, short, int, long, float, e double  tem valor igual a 0
        //char tem valor igual a '\u0000' '' vazio
        //boolean tem o valor igual false
        //String null

        int[][] arrayDeInt1 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};
        int[][] arrayDeInt = new int[3][];

        arrayDeInt[0] = new int[2];
        arrayDeInt[1] = new int[]{2,2,2};
        arrayDeInt[2] = new int[6];


        System.out.println("============= FOREACH ================");

        for(int[] arrayBase: arrayDeInt){
            System.out.println("\n============================");
            for(int num: arrayBase){
                System.out.print(num + "  ");
            }
        }
    }
}
