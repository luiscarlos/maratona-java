package academy.devdojo.maratonajava.javacore.Hheranca.test;


import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
    // 2 - Alocação do espaço em mémoria para o objeto da superclass
    // 3 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor  da superclasse é executado
    // 6 - Alocação espaço em memória para o objeto da subclass
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luis");
    }
}
