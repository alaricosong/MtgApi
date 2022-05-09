package com.zappts.MtgApi.service;

import java.util.List;
import java.util.Optional;

import com.zappts.MtgApi.model.Card;

public interface CardService {

    Card save(Card card);

    List<Card> findAll();
    
    List<Card> orderByName();
    
	List<Card> orderByPriceAsc();
	
	List<Card> orderByPriceDesc();

    Optional<Card> findById(Long id);

    Card update(Card card);

    void deleteById(Long id);


}
