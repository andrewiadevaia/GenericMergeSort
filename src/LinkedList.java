public class LinkedList<T> {
    private Node<T> head = null;
    private int length = 0;

    public void add(T data) {
        //create new node with data
        Node<T> new_node = new Node<T>(data);
        new_node.next = null;

        //if list is empty make head the new node
        if(this.head == null) {
            this.head = new_node;
        } else {
            //transverse list till last node then insert new
            Node<T> last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            //insert node
            last.next = new_node;
        }
        this.length++;
    }

    public void push(T data) {
        Node<T> new_node = new Node<T>(data);
        //make new node.next = head
        new_node.next = head;
        //make head point to new_node
        head = new_node;
    }

    public void deleteAtIndex(int position) {
        //if list is empty
        if(head == null) {
            return;
        }

        Node<T> temp = head;
        //if head needs to be removed
        if(position == 0) {
            head = temp.next; //change head
            return;
        }

        //find previous node of the node to be deleted
        for(int i = 0; temp != null && i < position-1; i++) {
            temp = temp.next;
        }
        //if position exceeds list length
        if(temp == null || temp.next == null) {
            return;
        }

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node<T> next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }

    public int getLength() {
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void freeList() {
        //free list from memory
        head = null;
    }

    public void printList() {
        Node<T> currentNode = this.head;
        System.out.println("Linked List:");

        while (currentNode != null) {
            if(currentNode.next != null) {
                System.out.print(currentNode.toString() + " -> ");
            } else {
                System.out.print(currentNode.toString() + "\n");
            }
            currentNode = currentNode.next;
        }
    }
}
