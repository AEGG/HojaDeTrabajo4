/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class StackArrayListTest {
    
   

    /**
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = 3;
        StackArrayList instance = new StackArrayList();
        instance.push(item);
        Object result = instance.pop();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(item, result);
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackArrayList instance = new StackArrayList();
        Object item = 3;
        instance.push(item);
        Object result = instance.pop();
        assertEquals(item, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackArrayList instance = new StackArrayList();
        Object item = 3;
        instance.push(item);
        Object result = instance.peek();
        assertEquals(item, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackArrayList instance = new StackArrayList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
