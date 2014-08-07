/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */

package calculadora;

public class doubleLinkedList<E> extends AbstractList<E>{
    
    
    
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public doubleLinkedList()
    // post: constructs an empty list
    {
       head = null;
       tail = null;
       count = 0;
    }


    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
       // construct a new element, making it head
       head = new DoublyLinkedNode<E>(value, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;
    }
    
    @Override
    public int size() {
        return count;
    }

    @Override
    public E removeFirst() {
        E val=head.value();
        DoublyLinkedNode<E> nextHead=head.next();
        head=nextHead;
        count--;
        return val;
    }
    
    @Override
    public E getFirst() {
        return head.value();
    }

    
}