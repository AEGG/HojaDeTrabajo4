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
public class ListFactory <E>{
    public List<E> getList(String entry) {
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
