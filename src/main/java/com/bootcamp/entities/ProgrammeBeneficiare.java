/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Archange
 */
@Entity(name = "tp_ProgrammeBeneficiare")
public class ProgrammeBeneficiare implements Serializable {
    
    @Id 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Programme_ID")  
private Programme Programme;
 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BENEFICIAIRE_ID")
    private Beneficiaire Beneficiaire;
    
    private String nom;
    
    

    
}
