/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */

package calculadora;

public abstract class AbstractStack<E> implements Stack<E> {
    
    
    public AbstractStack(){
   
    }
    
    public boolean empty(){
        return size()==0;
    }
    
}
