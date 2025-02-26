class LinkedListStack<T> implements StackInterface<T> {
    private class Node {
        T element;
        Node next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    private Node top = null;

    @Override
    public void push(T element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T data = top.element;
        top = top.next;
        return data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}