import java.util.Iterator;

class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to delete a node at a specific index
    public void delete(int index) {
        if (head == null || index < 0) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;
        int currentIndex = 0;

        while (current != null && currentIndex != index) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }

    // Method to print the linked list
    public void printList() {
        Iterator<T> iterator = new Iterator<T>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };

        iterator.forEachRemaining(data -> System.out.print(data + " "));
        System.out.println();
    }
}
