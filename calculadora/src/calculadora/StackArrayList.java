/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import calculadora.AbstractStack;
import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E>
{
	protected ArrayList<E> data;
        protected int cont;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
                cont++;
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(cont-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(cont-1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return cont;
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
           return cont == 0; 
        }
}
    