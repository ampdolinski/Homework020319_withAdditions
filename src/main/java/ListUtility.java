import java.util.ArrayList;
import java.util.List;

/**
 * @author Jacek Herrmann
 * Date: 2019-03-02
 */
public class ListUtility<T extends Number> {
    private List<T> lista = new ArrayList<T>();

    public void wypisz() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%d ", lista.get(i));
        }
        System.out.println();
    }

    // Adam
    // a. dodaj liczbe do listy
    public void addNumber(T number) {
        lista.add(number);
    }

    // b. usun liczbe z listy
    public void removeNumber(T number) {
        lista.remove(number);
    }

    // c. znajdź pozycję minimum
    public int getIndexOfMin() {
        int index = 0;
        double min = Double.parseDouble(String.valueOf(lista.get(0)));
        double currentNum;
        for (int i = 0; i < lista.size(); i++) {
            currentNum = Double.parseDouble(String.valueOf(lista.get(i)));
            if (currentNum < min) {
                min = currentNum;
                index = i;
            }
        }

        return index;
    }

    // d. znajdź pozycję maximum
    public int getIndexOfMax() {
        int index = 0;
        double max = Double.parseDouble(String.valueOf(lista.get(0)));
        double currentNum;
        for (int i = 0; i < lista.size(); i++) {
            currentNum = Double.parseDouble(String.valueOf(lista.get(i)));
            if (currentNum > max) {
                max = currentNum;
                index = i;
            }
        }
        return index;
    }

    // e. znajdź minimum,
    public T getMin() {
        List<T> tempList = new ArrayList<>(lista);
        tempList.sort(new TComparator(true));
        return tempList.get(0);
    }

    // f. znajdź maximum,
    public T getMax() {
        List<T> tempList = new ArrayList<>(lista);
        tempList.sort(new TComparator(false));
        return tempList.get(0);
    }

    // g. posortuj elementy rosnąco,
    public List<T> sortUp() {
        lista.sort(new TComparator(true));
        return lista;
    }

    // h. posortuj elementy malejąco,
    public List<T> sortDown() {
        lista.sort(new TComparator(false));
        return lista;
    }

    // i. zwróć medianę
    public T getMedian() {
        List<T> tempList = new ArrayList<>(lista);
        tempList.sort(new TComparator(false));

        if (tempList.size() % 2 == 0) {
            return tempList.get(tempList.size() / 2);
        } else {
            return tempList.get(tempList.size());
        }
    }

    // JACEK
    // j. zwróć średnią
    public double getAverage() {
//        T suma = 0;
        return 0.0;
    }

    // k. zwróć ilość obiektów
    public int getNumOfElements() {
        return lista.size();
    }

    // l. policz ilość wystąpień elementu (podajemy jako argument liczbę T i wtedy mamy policzyć ile razy występuje)

    // m. policz ilość liczb mniejszych od (podajemy liczbę jako argument, metoda zwaraca ilość mniejszych liczb)

    // n. policz ilość liczb większych od (podajemy liczbę jako argument, metoda zwaraca ilość większych liczb)

    // o. policz ilość liczb parzystych

    // p. policz ilość liczb nieparzystych

    // r. policz ilość różnych liczb w liście (np. dla 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 10 - powinno wyjść 4 [1, 2, 3, 10])

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
