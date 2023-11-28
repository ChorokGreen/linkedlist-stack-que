class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public T dequeue() {
        if (front == null) {
            return null; // Queue is empty
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // Last element removed, set rear to null
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}