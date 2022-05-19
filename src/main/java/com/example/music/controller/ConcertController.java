package com.example.music.controller;

import com.example.music.model.Concert;
import com.example.music.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("concerts")
public class ConcertController {

    @Autowired
    ConcertRepository concertRepository;

    @GetMapping
    public ResponseEntity<List<Concert>> getAllConcerts() {
        return new ResponseEntity(concertRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Concert>> getConcert(@PathVariable Long id) {
        return new ResponseEntity(concertRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Concert>> postConcert(@RequestBody Concert concert) {
        concertRepository.save(concert);
        return new ResponseEntity(concertRepository.findAll(), HttpStatus.CREATED);
    }
}
