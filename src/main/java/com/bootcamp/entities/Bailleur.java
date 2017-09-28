/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import com.bootcamp.enums.TypeBailleur;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Archange
 */
@Entity(name = "tp_bailleur")
@DiscriminatorValue("Bailleur")
public class Bailleur extends Personne{
    
    @Enumerated(EnumType.STRING)
    private TypeBailleur typeBailleur;
     
     
    @OneToMany(mappedBy = "Bailleur")
    private List<BailleurProgramme> bailleurProgramme ;
    
     
     @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tp_bailleur_projet",
            joinColumns = @JoinColumn(name = "bailleur_id"),
            inverseJoinColumns = @JoinColumn(name = "projet_id")
    )
    private List<Projet> Projet;
    
     
          @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tp_bailleur_programme",
            joinColumns = @JoinColumn(name = "bailleur_id"),
            inverseJoinColumns = @JoinColumn(name = "programme_id")
    )
    private List<Programme> Programme;

    public Bailleur() {
    }

    @Override
    public void add(Integer id, String nom){
    super.add(id, nom);
    }

}
