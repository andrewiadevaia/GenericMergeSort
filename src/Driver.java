import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
        //Int example
        Integer[] arr = {9,8,7,6,5,4,3,2,1};
        //making a comparator to pass as argument for the mergesort function
        //note: (l, r) -> l - r is a lambda function all it means is use l and r as parameters then do what the arrow points to.
        //l - r is really what the Interger compareTo method is doing that is why it returns 0, neg or pos number
        /*
        Note:
        When creating a comparator<T> set its type to whatever you want to use. Define it using a lambda function, basically a lambda is the same
        as saying (parmeter1, parmeter2) -> {code block} or -> expression. I use compareTo for int and string because the wrapper class of Integer
        and String already have a compareTo function. For the car object I created two functions to compare the object attributes. And then called
        one of those for its comparator. Pass comparator to mergeSortArray function
        */
        Comparator<Integer> integerComparator = (l, r) -> l.compareTo(r);
        //mergeSortArray is static so no need to instantiate a MergeSort instance
        MergeSort.mergeSortArray(arr,arr.length,integerComparator);
        printArray(arr);

        //String example
        String[] sarr = {"test", "tes", "te", "t"};
        //When making a comparator you can also use the Types compare method if it has one. Like how string has comapreTo
        Comparator<String> stringComparator = (l, r) -> l.compareTo(r);
        MergeSort.mergeSortArray(sarr, sarr.length, stringComparator);
        printArray(sarr);

        //Custom object example
        Car [] carr = new Car[4];
        carr[0] = new Car("Honda", 2010);
        carr[1] = new Car("Tesla", 2020);
        carr[2] = new Car("Cadillac", 2015);
        carr[3] = new Car("Alfa", 2008);

        //Here the comparator can either be compareByType or compareByYear refer to car class
        Comparator<Car> carComparator = (l, r) -> l.compareByType(r);
        MergeSort.mergeSortArray(carr, carr.length, carComparator);
        printArray(carr);
    }

    //generic print array
    static <T> void printArray(T[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
