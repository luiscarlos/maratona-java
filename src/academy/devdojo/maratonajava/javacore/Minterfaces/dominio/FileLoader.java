package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Crregando dados de um arquivo");
    }

    @Override
    public void remover() {
        System.out.println( "Deletando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão de leitura no arquivo");
    }
}
