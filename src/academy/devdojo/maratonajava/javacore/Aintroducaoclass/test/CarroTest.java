package academy.devdojo.maratonajava.javacore.Aintroducaoclass.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclass.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1 = carro2;

        carro1.nome = "Argo";
        carro1.modelo = "Fiat";
        carro1.ano = 2025;

        carro2.nome = "Corsa";
        carro2.modelo = "Chevrolet";
        carro2.ano = 2024;

        System.out.println("============== CARRO1 =================");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("============== CARRO2 =================");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
