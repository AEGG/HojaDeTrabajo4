/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

public abstract class AbstractList<E> implements List<E> {
   
    /**
     * Pre: ninguna.
     * Post: ninguna.
     */ 
    public AbstractList() {
   
    }

   
    /** 
     * Pre: ninguna.
     * Post: retorna verdadero si y sólo si la lista no contiene ningún elemento.
     */ 
    public boolean isEmpty() 
    {
        return size() == 0;
    }
  
    
}
