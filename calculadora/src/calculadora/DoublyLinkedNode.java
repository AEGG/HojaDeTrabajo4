/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */

package calculadora;

public class DoublyLinkedNode<E>
{
protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;

public DoublyLinkedNode(E v,
                        DoublyLinkedNode<E> next,
                        DoublyLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

/** 
     * pre: ninguna.
     * post: regresa la referencia al elemento siguiente
     */ 
    public DoublyLinkedNode<E> next() {
        return nextElement;
    }
    
    /** 
     * Pre: ninguna.
     * Post: regresa la referencia anterior
     */ 
    public DoublyLinkedNode<E> previous() {
        return previousElement;
    }
    
    /** 
     * Pre: ninguna.
     * Post: establece una referencia a un elemento siguiente
     */ 
    public void setNext(DoublyLinkedNode<E> v) {
        nextElement = v;
    }
    
    /** 
     * Pre: ninguna.
     * Post: establece una referencia a un elemento previo 
     */ 
    public void setPrevious(DoublyLinkedNode<E> v) {
        previousElement = v;
    }
    
    /**
     * Pre: ninguna.
     * Post: regresa el valor 
     */ 
    public E value() {
        return data;
    }

    /** 
     * Pre: ninguna.
     * Post: establece el valor 
     */
    public void setValue(E value) {
        data = value;
    }


}