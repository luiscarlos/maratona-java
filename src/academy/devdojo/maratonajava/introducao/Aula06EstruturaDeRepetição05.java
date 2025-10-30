package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição05 {


    public static void main(String[] args) {

        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000

        double valorTotal = 30000;

        for(int parcela = (int)valorTotal ; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;

            if(valorParcela < 1000 ){
                continue;
            }else{
                System.out.printf(" Parcela %2d - Vallor da parcela: R$ %.2f%n ", parcela , valorParcela);
            }
        }



    }
}

