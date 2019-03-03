import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListUtility<Integer> list1 = new ListUtility<Integer>();
        list1.addNumber(10);
        list1.addNumber(1);
        list1.addNumber(3);
        list1.addNumber(15);
        list1.addNumber(58);
        list1.addNumber(60);
        list1.removeNumber(60);

        list1.wypisz();
        System.out.println(list1.getIndexOfMax());
//        System.out.println(list1.getNumOfElements());
//        list1.sortUp();
//        list1.wypisz();
//        list1.sortDown();
//        list1.wypisz();

//        Scanner scanner = new Scanner(System.in);
//
//        List<Number> listaLista = new ArrayList<Number>();
//
//        boolean loop = true;
//
//        while (loop) {
//            try {
//                System.out.println("Co chcesz zrobić: (dodaj / usuń / pozMin / pozMax / min / max / rosnaco / malejaco / " +
//                        "mediana / srednia / iloscWszystkich / iloscElementu / " +
//                        "iloscMniejszych / iloscWiekszych / iloscParzystych / " +
//                        "iloscNieparzystych / iloscNiepowtarzalnych)");
//                switch (scanner.nextLine()) {
//                    case "dodaj":
//                        Number dodaj = scanner.nextLong();
//                        listaLista.add(dodaj);
//                        break;
//                    case "usun":
//                        Number usun = scanner.nextLong();
//                        listaLista.remove(usun);
//                        break;
//                    case "pozMin":
//                       List<Number> kopia = new ArrayList<Number>(listaLista);
//                        Number min = kopia.get(0);
//                        int pozycjaMin = 0;
//                        for (int i = 1; i < kopia.size(); i++) {
//                            if (min > kopia.get(i)) //tutaj jakiś problem,
//                            //nie chce ">" dla typu Numers
//                            {
//                                min = kopia.get(i);
//                                pozycjaMin = i;
//                            }
//                        }
//                        System.out.println("minimum znaleziono na pozycji: " + pozycjaMin);
//
//                        break;
//                    case "pozMax":
//                        List<Number> kopia2 = new ArrayList<Number>(listaLista);
//                        Number max = kopia2.get(0);
//                        int pozycjaMax = 0;
//                        for (int i = 1; i < kopia2.size(); i++) {
//                            if (max < kopia2.get(i)) {
//                                max = kopia2.get(i);
//                                pozycjaMax = i;
//                            }
//                        }
//                        System.out.println("maximum znaleziono na pozycji: " + pozycjaMax);
//                        break;
//                    case "min":
//                        List<Number> kopia3 = new ArrayList<Number>(listaLista);
//                        Number min2 = kopia3.get(0);
//                        for (int i = 1; i < kopia3.size(); i++) {
//                            if (min2 > kopia3.get(i)) //tutaj jakiś problem,
//                            //nie chce ">" dla typu Numers
//                            {
//                                min2 = kopia3.get(i);
//                            }
//                        }
//                        System.out.println("minimum: " + min2 );
//                        break;
//                    case "rosnaco":
//                        List<Number> kopia4 = new ArrayList<Number>(listaLista);
//                        Number max3 = kopia4.get(0);
//                                                for (int i = 1; i < kopia4.size(); i++) {
//                            if (max3 < kopia4.get(i)) {
//                                max3 = kopia4.get(i);
//                            }
//                        }
//                        System.out.println("lista rosnąco: " + i);
//                    case "malejaco":
//                        List<Number> kopia5 = new ArrayList<Number>(listaLista);
//                        Number min3 = kopia5.get(0);
//                        for (int i = 1; i < kopia5.size(); i++) {
//                            if (min3 > kopia5.get(i)) //tutaj jakiś problem,
//                            //nie chce ">" dla typu Numers
//                            {
//                                min3 = kopia5.get(i);
//                            }
//                        }
//                        System.out.println("minimum: " + min3 );
//                        break;
//                    case "mediana":
//                        //
//                        //
//                        //
//                        break;
//                }

//        Metody:
//        a. dodaj liczbe do listy
//        b. usun liczbe z listy
//        c. znajdź pozycję minimum
//        d. znajdź pozycję maximum
//        e. znajdź minimum,
//        f. znajdź maximum,
//        g. posortuj elementy rosnąco,
//                h. posortuj elementy malejąco,
//        i. zwróć medianę

//        } catch(NumberFormatException e){
//                System.out.println("Niepoprawnie wprowadzona wartość spróbuj jeszcze raz!");
//            }
//        }
//        System.out.println("KONIEC");
    }
}
