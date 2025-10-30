package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args) {

        int idade = 20;

        boolean isAutorizadoComprarBebidas = idade >= 18;
        if(isAutorizadoComprarBebidas){
            System.out.println("Pode beber vinho!!!");
        }else{
            System.out.println("Não pode beber vinho!!!");
        }

    }
}
