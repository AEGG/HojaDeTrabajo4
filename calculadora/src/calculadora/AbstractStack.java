/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author Javier Bucaro
 */
public abstract class AbstractStack<E> implements Stack<E> {
    private int cont;
    
    public AbstractStack(){
   
    }
    
    public boolean empty(){
        return size()==0;
    }
    
    public int size(){
        return cont;
    }
}
