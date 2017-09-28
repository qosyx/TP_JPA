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
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Archange
 */
@Entity(name = "tp_beneficiaire")
@DiscriminatorValue("Beneficiaire")
public class Beneficiaire extends Personne {
  

    @OneToMany(mappedBy = "Beneficiaire")
    private List<ProgrammeBeneficiare> ProgrammeBeneficiare ;
    
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tp_bailleur_projet",
            joinColumns = @JoinColumn(name = "bailleur_id"),
            inverseJoinColumns = @JoinColumn(name = "projet_id")
    )
    private List<Projet> projet ;
    
    
    
         
     @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tp_beneficiaire_projet",
            joinColumns = @JoinColumn(name = "beneficiaire_id"),
            inverseJoinColumns = @JoinColumn(name = "projet_id")
    )
    private List<Projet> Projet;
    
}


