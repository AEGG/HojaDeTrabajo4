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
public interface List<E> 
{

   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements


   public void addFirst(E value);
   // post: value is added to beginning of list


   public E getFirst();
   
  
   public E removeFirst();
}

