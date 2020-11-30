import java.util.Comparator;

public class MergeSort {

    public static <T> void mergeSortArray(T[] array, int n, Comparator<T> comparator) {
        //make sure there is more than one element in array, otherwise return
        if(n < 2) {
            //calling return like this is like a break for a whole void function
            return;
        }

        //Finds middle of array, then creates two sub arrays.
        int mid = n/2;
        /*
        Because we are dealing with generics we cant do T l[] = new T[size]. Java doesnt know what T is until you run the program
        But we can create a new Object with a size we want. Then when we run the program our new Object is casted as a T[] whatever T is going to be.
        */
        T l[] = (T[]) new Object[mid];
        T r[] = (T[]) new Object[n - mid];

        //fill left array
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        //fill right array
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        //recursivly calling mergeSortArray on sub arrays the were created.
        //keep pasing comparator so it gets to mergeArray function
        mergeSortArray(l, mid, comparator);
        mergeSortArray(r, n - mid, comparator);
        /*
        What this looks like...
                     {10,6,8,5}
                    /          \
                   /            \
                {10,6}         {8,5}
               /      \       /     \
              /        \     /       \
            {10}       {6}  {8}      {5}
        */

        /*
        Now we merge sub arrays, mid is the length of left sub array and n - mid is length of right sub array
        ex: if you have an array of 4 elements n=4 then, mid = 2 so left sub array would be elements 0-1. The right sub array
        length would be n(4) - mid(2) = 2. So the right sub array is dealing with elements 2-3
        */
        mergeArray(array, l, r, mid, n - mid, comparator);
        /*
        What this looks like...
            {10}     {6}    {8}     {5}
              \      /        \      /
               \    /          \    /
               {6,10}           {5,8}
                  \                /
                   \              /
                    \            /
                     \          /
                      \        /
                       {5,6,8,10}
        */
    }

    private static <T> void mergeArray(T[] a, T[] l, T[] r, int left, int right, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;
        //i is iterator for left subarray and j is iterator for right subarray
        while (i < left && j < right) {
            //here comparator is being used from main method, this is same as l[i] <= r[j]
            if(comparator.compare(l[i],r[j]) <= 0) {
                //if it is same or less then set real array index to sub array element
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


}
