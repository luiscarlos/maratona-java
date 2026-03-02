package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DateBseLoader implements DataLoader, DataRemover {


    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados ");
    }
}
