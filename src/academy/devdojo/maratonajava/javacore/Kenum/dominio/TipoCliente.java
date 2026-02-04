package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
     PESSOA_FISICA(1, "Pessoa fisica"), PESSOA_JURIDICA(2, "Pessoa juridica");

     private int valor;
     private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoClinete: values()){
            if(tipoClinete.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoClinete;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
