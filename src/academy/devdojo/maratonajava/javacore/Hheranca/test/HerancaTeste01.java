package academy.devdojo.maratonajava.javacore.Hheranca.test;


import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("RUA 10");
        endereco.setCep("50710-160");

        Pessoa pessoa = new Pessoa("Carlos");
        //pessoa.setNome("Carlos");
        pessoa.setCpf("11111111111111");
        pessoa.setEndereco(endereco);


        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Pedro");
        //funcionario.setNome("Pedro");
        funcionario.setCpf("22222222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200.00);

        funcionario.imprimir();
    }
}
