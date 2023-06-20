public class CircularLinkedList<T> implements LinkedList<T> {
    protected Node<T> head;

    public CircularLinkedList() {
        head = null;
    }

    @Override
    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            head.setNext(head);
        } else {
            Node<T> current = head;
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
        }
    }

    @Override
    public void insertNode(T data, int position) {
        Node<T> newNode = new Node<>(data);

        if (position <= 0) {
            newNode.setNext(head);
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
            Node<T> current = head;
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(head.getNext());
            head = head.getNext();
            return;
        }

        Node<T> current = head;
        while (current.getNext() != head && !current.getNext().getData().equals(data)) {
            current = current.getNext();
        }

        if (current.getNext() != head) {
            current.setNext(current.getNext().getNext());
        }
    }

    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
            if (current == head) {
                break;
            }
        }
        return sb.toString();
    }
}
