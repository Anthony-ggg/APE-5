public class Main {
    public static void main(String[] args) {
        System.out.println("LISTA ENLAZADA SIMPLE");
        LinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        System.out.println(singlyLinkedList);
        singlyLinkedList.insertNode(3, 1);
        System.out.println(singlyLinkedList);
        singlyLinkedList.deleteNode(1);
        System.out.println(singlyLinkedList);

        System.out.println("LISTA ENLAZADA DOBLE");
        LinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addNode("A");
        doublyLinkedList.addNode("B");
        System.out.println(doublyLinkedList);
        doublyLinkedList.insertNode("C", 1);
        System.out.println(doublyLinkedList);
        doublyLinkedList.deleteNode("A");
        System.out.println(doublyLinkedList);

        System.out.println("LISTA ENLAZADA CIRCULAR");
        LinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.addNode(10);
        circularLinkedList.addNode(20);
        System.out.println(circularLinkedList);
        circularLinkedList.insertNode(30, 1);
        System.out.println(circularLinkedList);
        circularLinkedList.deleteNode(10);
        System.out.println(circularLinkedList);

        System.out.println("LISTA ENLAZADA DOBLE CIRCULAR");
        LinkedList<String> doublyCircularLinkedList = new DoublyCircularLinkedList<>();
        doublyCircularLinkedList.addNode("X");
        doublyCircularLinkedList.addNode("Y");
        System.out.println(doublyCircularLinkedList);
        doublyCircularLinkedList.insertNode("Z", 1);
        System.out.println(doublyCircularLinkedList);
        doublyCircularLinkedList.deleteNode("X");
        System.out.println(doublyCircularLinkedList);
    }
}
