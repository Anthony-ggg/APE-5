public class SinglyLinkedList<T> implements LinkedList<T> {
    protected Node<T> head;

    public SinglyLinkedList() {
        head = null;
    }

    @Override
    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }


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


    public void deleteNode(T data) {
        if (head == null) {
            return;
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null && !current.getNext().getData().equals(data)) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    //ToString
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
