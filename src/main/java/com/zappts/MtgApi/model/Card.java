package com.zappts.MtgApi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.zappts.MtgApi.model.enums.Language;


@Data
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    
    private String characteristics;

    private String edition;
    
    private Language language;
    
    private boolean foil;

    private Double price;

    private Integer amount;

}
