/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class FactoryList {
    
      public List getList(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese Implementacion de lista: \n0: Simple\n1: Doble\n2: Circular\n");
        int parametro=entrada.nextInt();
        entrada.nextLine();
        switch (parametro){
            case 0:
                return new singlyLinkedList ();
            case 1:
                return new doubleLinkedList();
            case 2:
                return new CircularList();
        }
        return null;
    }
    
}
