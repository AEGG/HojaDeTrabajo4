/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.Vector;

import java.util.*;

  
/**
 * Clase que implementa la intefaz Stack
 * @param <E>, que define el tipo de datos que recibe la pila
 */
public class StackVector<E>  implements Stack<E>{
	
    protected Vector<E> data;
    private int cont=0;
    private E temporal;
    
        /**
         * Método que inicializa el objeto de tipo vector
         */
	public StackVector()
	{
		data = new Vector<E>();
	}
        
        /**
         * 
         * @param item 
         * Recibe un valor y lo coloca en la posición de un contador
         */
	public void push(E item)
	{
                data.addElement(item);
                cont++;
	}
        
        /**
         * 
         * @return  el dato que se eliminó de la pila (siempre es el último que se ingresó)
         */
	public E pop()
	{                
                temporal=data.get(cont-1);
                data.removeElementAt(cont-1);
           
		return temporal;
	}
        
        /**
         * 
         * @return el último valor que se ingresó
         */
	public E peek()
	{
		return data.get(cont-1);
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
