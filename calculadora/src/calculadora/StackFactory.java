/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */
package calculadora;

import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class StackFactory <E>{
    Scanner entry = new Scanner(System.in);
/**
 * tomado del ejemplo de clase
 * se utiliza el patron Factory
 * selecciona la implementacion a utilizar para un stack 
 */
    
   public Stack<E> getStack() {
       //System.out.println("Ingrese el método que desea utilizar: StackArrayList\n StackVector\n StackList\n");
    // seleccion de la implementacion a utilizar:
	if (entry.equals("StackArrayList"))
            return new StackArrayList<E>(); //regresa ArrayList

        if (entry.equals("StackVector"))
            return new StackVector<E>(); //regresa Vector
        
        if (entry.equals("StackList"))
            return new StackLista<E>(); //regresa List
        
        else
            return null;
   }
}

