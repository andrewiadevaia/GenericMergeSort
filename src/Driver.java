import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(10);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(7);

        list.printList();

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
    }
}
