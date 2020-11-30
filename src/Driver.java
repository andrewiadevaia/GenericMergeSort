import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();

        LinkedList<Integer> integerList = new LinkedList();
        integerList.add(10);
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);
        integerList.add(7);

        System.out.print("Pre Sorted ");
        integerList.printList();

        ms.setComparator(Util.integerComparator());
        ms.mergeSortList(integerList);

        System.out.print("\nPost Sorted ");
        integerList.printList();

        LinkedList<Car> carList = new LinkedList<>();
        carList.add(new Car("Honda", 2010));
        carList.add(new Car("Tesla", 2020));
        carList.add(new Car("Cadillac", 2015));
        carList.add(new Car("Alfa", 2008));

        System.out.print("\nPre Sorted ");
        carList.printList();

        ms.setComparator(Util.carYearComparator());
        ms.mergeSortList(carList);

        System.out.print("\nBy Year Post Sorted ");
        carList.printList();

        ms.setComparator(Util.carTypeComparator());
        ms.mergeSortList(carList);
        System.out.print("\nBy Type Post Sorted ");
        carList.printList();

        String[] strings = {"test", "tes", "te", "t"};
        System.out.println("\nPre Sorted:");
        printArray(strings);

        ms.setComparator(Util.stringComparator());
        ms.mergeSortArray(strings, strings.length);

        System.out.println("Post Sorted:");
        printArray(strings);

        Double[] doubles = {1.23, 0.43, 4.13, 6.23, 9.1, 0.6};
        System.out.println("\nPre Sorted:");
        printArray(doubles);

        ms.setComparator(Util.doubleComparator());
        ms.mergeSortArray(doubles, doubles.length);

        System.out.println("Post Sorted:");
        printArray(doubles);
    }

    static <T> void printArray(T[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
