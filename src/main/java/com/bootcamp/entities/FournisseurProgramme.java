/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Archange
 */
@Entity(name = "tp_Fournisseurprogramme")
public class FournisseurProgramme implements Serializable {
    
        @Id 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FOURNISSEUR_ID")
    private Fournisseur fournisseur;
        
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Programme_ID")  
    private Programme Programme;
 

    
    private String nom;
    
}
