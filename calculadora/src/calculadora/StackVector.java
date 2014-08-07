/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */


package calculadora;


import java.util.*;
  

public class StackVector<E> extends AbstractStack <E>{
//Tomado como base de la hoja de trabajo 2 ya que se empleo el mismo stackVector	
    protected Vector<E> vector;
    private int cont=0;
    private E temporal;
    
        /**
         * Método que inicializa el objeto de tipo vector
         */
	public StackVector()
	{
		vector = new Vector<E>();
	}
        
        /**
         * 
         * 
         * Recibe un valor y lo coloca en la posición de un contador
         */
	public void push(E item)
	{
                vector.insertElementAt(item,cont);
                cont++;
	}
        
        /**
         * 
         * @return  el dato que se eliminó de la pila (siempre es el último que se ingresó)
         */
	public E pop()
	{                
                temporal=vector.elementAt(cont-1);
                vector.removeElementAt(cont-1);
                cont--;
		return temporal;
	}
        
        /**
         * 
         * @return el último valor que se ingresó
         */
	public E peek()
	{
		return vector.elementAt(cont-1);
	}
        
	/**
         * 
         * @return tamaño de la pila
         */
	public int size()
	{
		return cont;
	}
        
}
