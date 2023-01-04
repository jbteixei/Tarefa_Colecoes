import java.util.ArrayList;
import java.util.List;

public class ColecoesB {

    public static void main(String[] args) {
        exemploListaSexoMasculino();
        exemploListaSexoFeminino();    

    }

    private static void exemploListaSexoFeminino() {
        System.out.println("");
        System.out.println("***** exemploListaSexoFeminino *****");
        List<String> lista = new ArrayList<String>();
        lista.add("Maria-F");
        lista.add("Márcia-F");
        lista.add("Fernanda-F");
        lista.add("Amanda-F");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSexoMasculino() {
        System.out.println("");
        System.out.println("***** exemploListaSexoMasculino *****");
        List<String> lista = new ArrayList<String>();
        lista.add("João-M");
        lista.add("Davi-M");
        lista.add("Douglas-M");
        lista.add("Flávio-M");
        System.out.println(lista);
        System.out.println("");
    }
}
