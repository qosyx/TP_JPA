/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
public class GenerationTable {
    
    private EntityManager em ;
    public GenerationTable() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

      @Test
    public void tearDownMethod() throws Exception {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp_jpa");
        em = emf.createEntityManager();
        Programme marin = new Programme();
        em.getTransaction().begin();
        em.persist(marin);
        em.getTransaction().commit();
    }
}
