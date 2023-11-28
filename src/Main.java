public class Main {
    public static void main(String[] args) {
        // Create a generic linked list with integers
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Print the integer linked list
        System.out.println("Integer Linked List:");
        integerList.printList();

        // Delete node at index 1
        integerList.delete(1);

        // Print the modified integer linked list
        System.out.println("Integer Linked List after deleting node at index 1:");
        integerList.printList();

        // Create a generic linked list with strings
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        // Print the string linked list
        System.out.println("\nString Linked List:");
        stringList.printList();

        // Delete node at index 0
        stringList.delete(0);

        // Print the modified string linked list
        System.out.println("String Linked List after deleting node at index 0:");
        stringList.printList();

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue()); // Output: 1 2 3
        }

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Output: C B A
        }
    }
}