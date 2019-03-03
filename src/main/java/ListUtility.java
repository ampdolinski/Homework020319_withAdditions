import java.util.ArrayList;
import java.util.List;

public class ListUtility<T extends Number> {
    private List<T> lista = new ArrayList<T>();

    public void wypisz() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(i + ", ");
        }
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public ListUtility(List<T> lista) {
        this.lista = lista;
    }
}