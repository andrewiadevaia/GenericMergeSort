import java.util.Comparator;

public class MergeSort<T> {

    private Comparator<T> comparator;

    public <T> void mergeSortList(LinkedList<T> list, Comparator<T> comparator) {
        list.head = mergeSortNodeHandler(list, list.head, comparator);
    }

    private <T> Node<T> mergeSortNodeHandler(LinkedList<T> list, Node<T> h, Comparator<T> comparator) {
        if(h == null || h.next == null) {
            return h;
        }

        Node<T> middle = list.getMiddle(h);
        Node<T> nextOfMiddle = middle.next;

        middle.next = null;

        Node<T> left = mergeSortNodeHandler(list, h, comparator);
        Node<T> right = mergeSortNodeHandler(list, nextOfMiddle, comparator);

        Node<T> sortedList = mergeList(left, right, comparator);
        return sortedList;

    }

    private <T> Node<T> mergeList(Node<T> a, Node<T> b, Comparator<T> comparator) {
        Node result = null;

        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }

        if(comparator.compare(a.data,b.data) <= 0) {
            result = a;
            result.next = mergeList(a.next, b, comparator);
        } else {
            result = b;
            result.next = mergeList(a, b.next, comparator);
        }
        return result;
    }

    public <T> void mergeSortArray(T[] array, int n, Comparator<T> comparator) {
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

    private <T> void mergeArray(T[] a, T[] l, T[] r, int left, int right, Comparator<T> comparator) {
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

    public void setComparator(Comparator<T> c) {
        this.comparator = c;
    }
}
