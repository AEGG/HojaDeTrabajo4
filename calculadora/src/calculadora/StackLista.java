/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */


package calculadora;



public class StackLista<E>  extends AbstractStack<E>{
	
    protected List<E> list;
   
        /**
         * Método que inicializa el objeto de tipo lista
         */
	public StackLista()
	{
		FactoryList<E> factory=new FactoryList<E>();
                list=factory.getList();
	}
        
        /**
         * 
         *
         * Recibe un valor y lo coloca en la posicion
         */
	public void push(E item)
	{
                list.addFirst(item);
                
	}
        
        /**
         * 
         * @return  el dato que se eliminó de la pila (siempre es el último que se ingresó)
         */
	public E pop()
	{                
                return list.removeFirst();
	}
        
        /**
         * 
         * @return el último valor que se ingresó
         */
	public E peek()
	{
		return list.getFirst();
	}
        
	/**
         * 
         * @return tamaño de la pila
         */
	public int size()
	{
		return list.size();
	}
        
        
    
}

