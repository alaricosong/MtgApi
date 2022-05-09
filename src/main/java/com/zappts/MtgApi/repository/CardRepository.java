package com.zappts.MtgApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zappts.MtgApi.model.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	
	@Query(nativeQuery = true, value = "select * from card order by name asc")
    List<Card> orderByName();
	
	@Query(nativeQuery = true, value = "select * from card order by price asc")
    List<Card> orderByPriceAsc();
	
	@Query(nativeQuery = true, value = "select * from card order by price desc")
    List<Card> orderByPriceDesc();

}
