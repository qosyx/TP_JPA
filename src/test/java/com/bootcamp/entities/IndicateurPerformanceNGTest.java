/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Archange
 */
public class IndicateurPerformanceNGTest {
    
    public IndicateurPerformanceNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class IndicateurPerformance.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        IndicateurPerformance instance = new IndicateurPerformance();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class IndicateurPerformance.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        IndicateurPerformance instance = new IndicateurPerformance();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class IndicateurPerformance.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        String b = "";
        IndicateurPerformance instance = new IndicateurPerformance();
        instance.add(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIP method, of class IndicateurPerformance.
     */
    @Test
    public void testGetIP() {
        System.out.println("getIP");
        IndicateurPerformance instance = new IndicateurPerformance();
        List expResult = null;
        List result = instance.getIP();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
