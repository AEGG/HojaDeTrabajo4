/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author Acer
 */
public class CircularList<E> extends AbstractList<E> {
    
    //codgigo tomado de material visto en clase
    //Aqui comienza codigo tomado
    //=============================================
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
    //===============================================================
    //Aqui termina codigo tomado

    @Override
    public int size() {
        return count;
    }

    @Override
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