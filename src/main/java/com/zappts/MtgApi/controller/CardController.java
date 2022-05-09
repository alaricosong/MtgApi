package com.zappts.MtgApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zappts.MtgApi.model.Card;
import com.zappts.MtgApi.service.CardService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("mtgapi/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping
    public ResponseEntity<List<Card>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.findAll());
    }
    
    @GetMapping("/ordemAlfabetica")
    public ResponseEntity<List<Card>> orderByName(){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.orderByName());
    }
    
	@GetMapping("/ordemPrecoCrescente")
    public ResponseEntity<List<Card>> orderByPriceAsc(){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.orderByPriceAsc());
    }
    
    @GetMapping("/ordemPrecoDecrescente")
    public ResponseEntity<List<Card>> orderByPriceDesc(){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.orderByPriceDesc());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Card>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Card> create(@RequestBody Card card){
        return ResponseEntity.status(HttpStatus.CREATED).body(cardService.save(card));
    }

    @PutMapping
    public ResponseEntity<Card> update(@RequestBody Card card){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.update(card));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        cardService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
