/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */

package calculadora;

/**
 *
 * @author Acer
 */
public class CircularList<E> extends AbstractList<E> {
    
    protected Node<E> tail; 
    protected int count;

    public CircularList()
    // pre: constructs a new circular list
    {
       tail = null;
       count = 0;
    }

    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
       Node<E> temp = new Node<E>(value);
       if (tail == null) { // first value added
           tail = temp;
           tail.setNext(tail);
       } else { // element exists in list
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }
    
    public int size() {
        return count;
    }

    
    public E getFirst() {
        if(tail!=null){
            return tail.next().value();
        }else{
            return null;
        }
    }

    @Override
    public E removeFirst() {
        E val=null;
        if(tail!=null){
            val=tail.next().value();                    //Se gurada el valor
            Node<E> newFirst=tail.next().next();        //se crea la referencia al nuevo primer valor
            tail.setNext(newFirst);                     //se setea como el nuevo primer valor
        }
        count--;
        return val;
    }
    

    
}