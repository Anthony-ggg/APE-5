public class DoublyCircularLinkedList<T> implements LinkedList<T> {
    protected Node<T> head;

    public DoublyCircularLinkedList() {
        head = null;
    }

    @Override
    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            head.setNext(head);
            head.setPrevious(head);
        } else {
            Node<T> tail = head.getPrevious();
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            newNode.setNext(head);
            head.setPrevious(newNode);
        }
    }

    @Override
    public void insertNode(T data, int position) {
        Node<T> newNode = new Node<>(data);

        if (position <= 0) {
            newNode.setNext(head);
            newNode.setPrevious(head.getPrevious());
            head.getPrevious().setNext(newNode);
            head.setPrevious(newNode);
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
                current.getNext().setPrevious(newNode);
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
            Node<T> tail = head.getPrevious();
            tail.setNext(head.getNext());
            head.getNext().setPrevious(tail);
            head = head.getNext();
            return;
        }

        Node<T> current = head;
        while (current.getNext() != head && !current.getNext().getData().equals(data)) {
            current = current.getNext();
        }

        if (current.getNext() != head) {
            current.setNext(current.getNext().getNext());
            current.getNext().setPrevious(current);
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
            if (current == head) {
                break;
            }
        }
        return result.toString();
    }
}
