/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.io.*;

public class Calculadora {
       private static Stack<Integer> datos;
       
       
       public static void main(String[] args){
        Calculadora calculadora = Singleton.getInstance();
     
    
        StackFactory<Integer> fact=new StackFactory<Integer>();
        datos=fact.getStack();
        datos= new StackVector<Integer>();
        String strLinea1=" ";
        String strLinea= " ";		
        /**
         * Se lee la cadena ingresada en un archivo de texto
         */
		 try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("C:\\Users\\Acer\\Documents\\UVG\\4to semestre\\Alg Estructura Datos\\HDT4\\HojaDeTrabajo4\\calculadora\\src\\calculadora\\texto.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            
            // Leer el archivo linea por linea
            while ((strLinea1 = buffer.readLine()) != null)   {
                 /**
                 * Se imprime la cadena leída
                 */
		strLinea = strLinea1;
                System.out.println ("Operacion ingresada: "+strLinea);
                
            }
            // Cerramos el archivo
            entrada.close();
        }
		/**
         * Se crea la excepción por si ocurre un error
         */
        catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        } 
         
       int resultado=0;
       int num1 = 0;
       int num2 = 0;   
	   /**
        * Se crea el ciclo para la clasificación y operaciónes de la cadena ingresada
        */
       for(int i=0; i<strLinea.length(); i++){
				/**
                 * Si encuentra un +, suma los dos últimos elementos de la pila
                 */
                if(strLinea.charAt(i)=='+'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 + num2;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un -, resta los dos últimos elementos de la pila
                */
                if(strLinea.charAt(i)=='-'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num2 - num1;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un *, multiplica los dos últimos elementos de la pila
                */
                if(strLinea.charAt(i)=='*'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 * num2;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un /, divide el penúltimo elemento dentro del último elemento de la pila
                */
                if(strLinea.charAt(i)=='/'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num2 / num1;
                    datos.push(resultado);
                }
				/**
                * Si encuentra un número, lo guarda en la pila
                */
                if (Character.getNumericValue(strLinea.charAt(i))>=0)
                {
				   int dato=Character.getNumericValue(strLinea.charAt(i));
                   datos.push(dato);
                }      
        }
	   /**
       * imprime el resultado en pantalla
       */
       System.out.println ("El resultado de las operaciones es: "+datos.pop()); 

	}
}
	
