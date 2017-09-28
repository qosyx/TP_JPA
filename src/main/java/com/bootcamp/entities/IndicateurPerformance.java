/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Archange
 */
@Entity(name = "tp_indicateurperformance")
public class IndicateurPerformance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
@Column(length = 45)
private String nom;

    @OneToMany(cascade={CascadeType.PERSIST})
    @JoinColumn
    private List<IndicateurQualitatif> indicateurQualitatif;
    
    @OneToMany(cascade={CascadeType.PERSIST})
    @JoinColumn
  
    private List<IndicateurQuantitatif> indicateurQuantitatif = new ArrayList<IndicateurQuantitatif>();
    
    public void add(int a, String b){
    this.id=a;
    this.nom=b;
    }
 //private Set<UserGroup> userGroups = new HashSet<UserGroup>();
     
    


   public List<IndicateurQualitatif> getIP () {
            return indicateurQualitatif;
      }

}
