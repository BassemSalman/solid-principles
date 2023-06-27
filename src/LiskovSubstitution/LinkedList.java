package LiskovSubstitution;

public class LinkedList<E> extends CustomList<E> {
    Node<E> head, tail;

    public void add(E e){
        Node<E> newNode = new Node<>(e);
        tail.next = newNode;
        tail = newNode;
    }
}
