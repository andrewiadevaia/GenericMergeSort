public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T d) {
        data = d;
    }

    public String toString() {
        return String.valueOf(data);
    }
}
