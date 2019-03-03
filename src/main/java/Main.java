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
    }

}
