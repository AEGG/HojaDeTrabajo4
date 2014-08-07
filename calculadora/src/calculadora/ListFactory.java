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
public class ListFactory <E>{
   Scanner entry = new Scanner(System.in);
    public List<E> getList() {
        
        //System.out.println("Ingrese el método que desea utilizar: CircularList\n doubleLinkedList\n singlyLinkedList\n");
   // seleccion de la implementacion a utilizar:
	if (entry.equals("CircularList"))
            return new CircularList<E>(); //regresa CircularList

        if (entry.equals("doubleLinkedList"))
            return new doubleLinkedList <E>(); //regresa doubleLinkedList
        
        if (entry.equals("singlyLinkedList"))
            return new singlyLinkedList<E>(); //regresa singlyLinkedList
        
        else
            return null;
   }
}
