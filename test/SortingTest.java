/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laboratorioms
 */
public class SortingTest {
    
    public SortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


 
    /**
     * Test of mergeSort method, of class Sorting.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        int[] array = {12,25,50,32,7,87,4,66,2,11};
        Sorting instance = new Sorting();
        int[] expResult = {2,4,7,11,12,25,32,50,66,87};
        int[] result = instance.mergeSort(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of QuickSort method, of class Sorting.
     */
    @Test
    public void testQuickSort() {
        System.out.println("QuickSort");
        int[] n = {12,25,50,32,7,87,4,66,2,11};
        int primero = 0;
        int ultimo = 0;
        int[] expResult = {2,4,7,11,12,25,32,50,66,87};
        Sorting instance = new Sorting();
        instance.QuickSort(n, primero, ultimo);
        assertArrayEquals(expResult, n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


}
