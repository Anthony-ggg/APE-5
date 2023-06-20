public class DoublyLinkedList<T> implements LinkedList<T> {
    protected Node<T> head;
    protected Node<T> tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
    }

    @Override
    public void insertNode(T data, int position) {
        Node<T> newNode = new Node<>(data);

        if (position <= 0) {
            newNode.setNext(head);
            if (head != null) {
                head.setPrevious(newNode);
            }
            head = newNode;
        } else {
            Node<T> current = head;
            int currentPosition = 0;
            while (current != null && currentPosition < position - 1) {
                current = current.getNext();
                currentPosition++;
            }
            if (current != null) {
                newNode.setNext(current.getNext());
                newNode.setPrevious(current);
                if (current.getNext() != null) {
                    current.getNext().setPrevious(newNode);
                }
                current.setNext(newNode);
            }
        }
    }

    @Override
    public void deleteNode(T data) {
        if (head == null) {
            return;
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            if (head != null) {
                head.setPrevious(null);
            }
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null && !current.getNext().getData().equals(data)) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            if (current.getNext() != null) {
                current.getNext().setPrevious(current);
            } else {
                tail = current;
            }
        }
    }

    //ToString
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            result.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return result.toString();
    }
}
