/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
     * Pre: ninguna.
     * Post: regresa la referencia al elemento posterior en la lista.
     */ 
    public DoublyLinkedNode<E> next() {
        return nextElement;
    }
    
    /** 
     * Pre: ninguna.
     * Post: regresa la referencia al elemento anterior en la lista.
     */ 
    public DoublyLinkedNode<E> previous() {
        return previousElement;
    }
    
    /** 
     * Pre: ninguna.
     * Post: establece una referencia a un elemento posterior (next).
     */ 
    public void setNext(DoublyLinkedNode<E> next) {
        nextElement = next;
    }
    
    /** 
     * Pre: ninguna.
     * Post: establece una referencia a un elemento previo (previous).
     */ 
    public void setPrevious(DoublyLinkedNode<E> previous) {
        previousElement = previous;
    }
    
    /**
     * Pre: ninguna.
     * Post: regresa el valor asociado al elemento.
     */ 
    public E value() {
        return data;
    }

    /** 
     * Pre: ninguna.
     * Post: establece el valor asociado al elemento.
     */
    public void setValue(E value) {
        data = value;
    }


}