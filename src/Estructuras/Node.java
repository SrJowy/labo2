package Estructuras;
public class Node<T> {
    public T data;
    public Node<T> next;

    Node(T data){
        this.next=null;
        this.data = data;
    }
}