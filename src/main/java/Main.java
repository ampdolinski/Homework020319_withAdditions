import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(10, 1, 3, 15, 15, 58, 60, 60, 70));
        ListUtility<Integer> numberList = new ListUtility<>(listOfIntegers);

        numberList.wypisz();

        // a. dodaj liczbe do listy
        numberList.addNumber(82);

        // b. usun liczbe z listy
        numberList.removeNumber(60);

        // c. znajdź pozycję minimum
        System.out.println("Index MIN: " + numberList.getIndexOfMin());

        // d. znajdź pozycję maximum
        System.out.println("Index MAX: " + numberList.getIndexOfMax());

        // e. znajdź minimum,
        System.out.println("MIN: " + numberList.getMin());

        // f. znajdź maximum,
        System.out.println("MAX: " + numberList.getMax());

        // g. posortuj elementy rosnąco,
        numberList.sortUp();
        System.out.print("Posortowane rosnąco: ");
        numberList.wypisz();

        // h. posortuj elementy malejąco,
        numberList.sortDown();
        System.out.print("Posortowane malejąco: ");
        numberList.wypisz();

        // i. zwróć medianę
        System.out.printf("Mediana: %.2f%n", numberList.getMedian());

        // j. zwróć średnią
        System.out.printf("Średnia: %.2f%n", numberList.getAverage());

        // k. zwróć ilość obiektów
        System.out.println("Ilość obeiektów: " + numberList.getNumOfElements());

        // l. policz ilość wystąpień elementu
        // (podajemy jako argument liczbę T i wtedy mamy policzyć ile razy występuje)
        System.out.println("Ilość wystąpień '15': " + numberList.countOccuriences(15));

        // m. policz ilość liczb mniejszych od
        // (podajemy liczbę jako argument, metoda zwaraca ilość mniejszych liczb)
        System.out.println("Ilość liczb < 10: " + numberList.countNumsLessThan(10));

        // n. policz ilość liczb większych od
        // (podajemy liczbę jako argument, metoda zwaraca ilość większych liczb)
        System.out.println("Ilość liczb > 10" + numberList.countNumsGreaterThan(10));

        // o. policz ilość liczb parzystych
        System.out.println("Ilość parzystych: " + numberList.countOddNums());

        // p. policz ilość liczb nieparzystych
        System.out.println("Ilość nieparzystych: " + numberList.countEvenNums());

        // r. policz ilość różnych liczb w liście
        // (np. dla 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 10 - powinno wyjść 4 [1, 2, 3, 10])
        System.out.println("Ilość unikatowych liczb:" + numberList.countUniqueNums());
    }
}
