package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DateBseLoader implements DataLoader {


    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
