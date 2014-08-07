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

