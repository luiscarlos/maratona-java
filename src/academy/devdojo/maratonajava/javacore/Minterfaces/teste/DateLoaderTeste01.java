package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DateBseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DateLoaderTeste01 {
    public static void main(String[] args) {
        DateBseLoader dateBseLoader = new DateBseLoader();
        FileLoader fileLoader = new FileLoader();

        dateBseLoader.load();
        fileLoader.load();

        dateBseLoader.remover();
        fileLoader.remover();

        dateBseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
