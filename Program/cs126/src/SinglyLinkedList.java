public class SinglyLinkedList<E>{
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e,Node<E> n){
            element = e;
            next = n;
        }
        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head =null;
    private Node<E> tail =null;
    private int size = 0;
    public SinglyLinkedList(){
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E first(){
        if(isEmpty() == true)
            return null;
        return head.getElement();
    }
    public E last(){
        if(isEmpty() == true)
            return null;
        else
            return tail.getElement();
    }
    public void addFirst(E e){
        head = new Node<>(e,head);//第1个head是新head，第二和head是老head?
        if(size == 0)
            tail = head;
        size++;
    }
    public void addLast(E e){
        Node<E> newest = new Node<>(e,null);
        if(isEmpty()==true)
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }
}
