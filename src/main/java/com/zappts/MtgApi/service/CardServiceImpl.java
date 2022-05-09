package com.zappts.MtgApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zappts.MtgApi.model.Card;
import com.zappts.MtgApi.repository.CardRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CardServiceImpl implements CardService{

	@Autowired
    private CardRepository cardRepository;

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }
    
    @Override
    public List<Card> orderByName() {
    	return cardRepository.orderByName();
	}
    
    @Override
	public List<Card> orderByPriceAsc() {
		return cardRepository.orderByPriceAsc();
	}
    
    @Override
    public List<Card> orderByPriceDesc() {
    	return cardRepository.orderByPriceDesc();
	}

    @Override
    public Optional<Card> findById(Long id) {
        return cardRepository.findById(id);
    }

    @Override
    public Card update(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public void deleteById(Long id) {
        cardRepository.deleteById(id);
    }


}
