/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.List;

public class StackLista<E>  extends AbstractStack<E>{
	
    protected List<E> list;
    private int cont=0;
    private E temporal;
    
        /**
         * Método que inicializa el objeto de tipo vector
         */
	public StackLista()
	{
		list = new List<E>() {};
	}
        
        /**
         * 
         * @param item 
         * Recibe un valor y lo coloca en la posición de un contador
         */
	public void push(E item)
	{
                list.insertElementAt(item,cont);
                cont++;
	}
        
        /**
         * 
         * @return  el dato que se eliminó de la pila (siempre es el último que se ingresó)
         */
	public E pop()
	{                
                temporal=list.elementAt(cont-1);
                list.removeElementAt(cont-1);
                cont--;
		return temporal;
	}
        
        /**
         * 
         * @return el último valor que se ingresó
         */
	public E peek()
	{
		return list.elementAt(cont-1);
	}
        
	/**
         * 
         * @return tamaño de la pila
         */
	public int size()
	{
		return cont;
	}
        
        /**
         * 
         * @return si la pila está vacía o no
         */
	public boolean empty()
	{
		return cont == 0;
	}
    
}

