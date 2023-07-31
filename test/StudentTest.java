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
 * @author TARUC
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getLanguagesTotal method, of class Student.
     */
    @Test
    public void testGetLanguagesTotal() {
        System.out.println("getLanguagesTotal");
        Student instance = new Student();
        int expResult = 150;
        instance.english = 80;
        instance.hindi = 70;
        instance.maths = 90;
        int result = instance.getLanguagesTotal();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNonLanguagesTotal method, of class Student.
     */
    @Test
    public void testGetNonLanguagesTotal() {
        System.out.println("getNonLanguagesTotal");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getNonLanguagesTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectsTotal method, of class Student.
     */
    @Test
    public void testGetAllSubjectsTotal() {
        System.out.println("getAllSubjectsTotal");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getAllSubjectsTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPCMPercentage method, of class Student.
     */
    @Test
    public void testGetPCMPercentage() {
        System.out.println("getPCMPercentage");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getPCMPercentage();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMarksSummary method, of class Student.
     */
    @Test
    public void testPrintMarksSummary() {
        System.out.println("printMarksSummary");
        Student instance = new Student();
        instance.printMarksSummary();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMarksDetails method, of class Student.
     */
    @Test
    public void testPrintMarksDetails() {
        System.out.println("printMarksDetails");
        Student instance = new Student();
        instance.printMarksDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
