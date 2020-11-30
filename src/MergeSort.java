import java.util.Comparator;

public class MergeSort {

    public static <T> void mergeSortArray(T[] array, int n, Comparator<T> comparator) {
        if(n < 2) {
            return;
        }

        int mid = n/2;
        T l[] = (T[]) new Object[mid];
        T r[] = (T[]) new Object[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        mergeSortArray(l, mid, comparator);
        mergeSortArray(r, n - mid, comparator);
        mergeArray(array, l, r, mid, n - mid, comparator);
    }

    private static <T> void mergeArray(T[] a, T[] l, T[] r, int left, int right, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if(comparator.compare(l[i],r[j]) <= 0) {
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
