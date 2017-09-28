/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Archange
 */
@Entity(name = "tp_fournisseur")
@DiscriminatorValue("Fournisseur")
public class Fournisseur extends Personne {
    
    
    
    
    
    @OneToMany(mappedBy = "Fournisseur")
    private List<FournisseurProgramme> fournisseurProgramme ;
    
    
}
