import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList();
        Comparator<Integer> integerComparator = Integer::compareTo;

        integerList.add(10);
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);
        integerList.add(7);

        integerList.printList();

        MergeSort.mergeSortList(integerList, integerComparator);

        integerList.printList();
        //using copyRange method
        //LinkedList<Integer> subList = list.copyRange(0, list.getMiddleIndex()-1);
        //subList.printList();
        /*
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("catch");
        stringList.add("me");
        stringList.add("if");
        stringList.add("you");
        stringList.add("can");

        //stringList.printList();

        LinkedList<Car> carList = new LinkedList<>();
        carList.add(new Car("Honda", 2010));
        carList.add(new Car("Tesla", 2020));
        carList.add(new Car("Cadillac", 2015));
        carList.add(new Car("Alfa", 2008));

        //carList.printList();

        */
    }
}
