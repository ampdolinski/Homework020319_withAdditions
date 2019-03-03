import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
public class ListUtility<T extends Number> {
    private List<T> lista = new ArrayList<T>();

    public void wypisz() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%d ", lista.get(i));
        }
        System.out.println();
    }

    public void addNumber(T number) {
        lista.add(number);
    }

    public void removeNumber(T number) {
        lista.remove(number);
    }

    public int getIndexOfMin() {
        int index = 0;
        double min = lista.get(0).doubleValue();
        double currentNum;

        for (int i = 0; i < lista.size(); i++) {
            currentNum = lista.get(i).doubleValue();
            if (currentNum < min) {
                min = currentNum;
                index = i;
            }
        }

        return index;
    }

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

    public T getMin() {
        List<T> tempList = new ArrayList<>(lista);
        tempList.sort(new TComparator(true));
        return tempList.get(0);
    }

    public T getMax() {
        List<T> tempList = new ArrayList<>(lista);
        tempList.sort(new TComparator(false));
        return tempList.get(0);
    }

    public List<T> sortUp() {
        lista.sort(new TComparator(true));
        return lista;
    }

    public List<T> sortDown() {
        lista.sort(new TComparator(false));
        return lista;
    }

    public double getMedian() {
        List<T> tempList = new ArrayList<>(lista);
        tempList.sort(new TComparator(false));
        double mediana;

        if (tempList.size() % 2 != 0) {
            mediana = tempList.get(tempList.size() / 2).doubleValue();
            return mediana;
        } else {
            mediana = ((tempList.get(tempList.size() / 2).doubleValue()) +
                    (tempList.get((tempList.size() / 2) - 1).doubleValue())) / 2;
            return mediana;
        }
    }

    public double getAverage() {
        double sum = 0;
        for (T t : lista) {
            sum += t.doubleValue();
        }
        return (sum / lista.size());
    }

    public int getNumOfElements() {
        return lista.size();
    }

    public int countOccuriences(T number) {
        int count = 0;
        for (T t : lista) {
            if (t.doubleValue() == number.doubleValue()) {
                count++;
            }
        }

        return count;
    }

    public int countNumsLessThan(T number) {
        int count = 0;
        for (T t : lista) {
            if (t.doubleValue() < number.doubleValue()) {
                count++;
            }
        }
        return count;
    }

    public int countNumsGreaterThan(T number) {
        int count = 0;
        for (T t : lista) {
            if (t.doubleValue() > number.doubleValue()) {
                count++;
            }
        }
        return count;
    }

    public int countOddNums() {
        int count = 0;
        for (T t : lista) {
            if (t.doubleValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countEvenNums() {
        int count = 0;
        for (T t : lista) {
            if (t.doubleValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int countUniqueNums() {
        Set<T> uniqueList = new HashSet<>(lista);
        return uniqueList.size();
    }
}
