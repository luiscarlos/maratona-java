package academy.devdojo.maratonajava.introducao;

public class Aula07Array03 {

    public static void main(String[] args) {

        //byte, short, int, long, float, e double  tem valor igual a 0
        //char tem valor igual a '\u0000' '' vazio
        //boolean tem o valor igual false
        //String null

        String[] nomes = new String[3];
        int[] numeros = new int[3];
        int[] numeros1 = {1,2,3,4,5};
        int[] numeros2 = new int[]{1,2,3,4,5};


        System.out.println("==============================  FOR =========================");
        for(int i=0; i< numeros2.length; i++){
            System.out.println(numeros2[i]);

        }

        System.out.println("==============================  FOREACH =========================");

        for(int num: numeros2){
            System.out.println(num);
        }
    }
}
