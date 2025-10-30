package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais01 {

    public static void main(String[] args) {

        //byte, short, int, long, float, e double  tem valor igual a 0
        //char tem valor igual a '\u0000' '' vazio
        //boolean tem o valor igual false
        //String null
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 1;
        dias[0][2] = 1;

        dias[1][0] = 2;
        dias[1][1] = 2;
        dias[1][2] = 2;

        dias[2][0] = 3;
        dias[2][1] = 3;
        dias[2][2] = 3;

        for(int i=0; i< dias.length;i++){
            for(int j=0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("============= FOREACH ================");

        for(int[] arrayBase: dias){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }

    }
}
