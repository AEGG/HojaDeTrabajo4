/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
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
