package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {

    public static void main(String[] args) {

        //byte, short, int, long, float, e double  tem valor igual a 0
        //char tem valor igual a '\u0000' '' vazio
        //boolean tem o valor igual false
        //String null

        String[] nomes = new String[3];

        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Luaca";


        for(int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);

        }
    }
}
