package com.example.music.controller;

import com.example.music.model.Musician;
import com.example.music.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("musicians")
public class MusicianController {

    @Autowired
    MusicianRepository musicianRepository;
    // this takes care of:
    //  * GET /musicians
    //  * GET /musicians/:id
    //  * GET /musicians?instrument=voice

    @GetMapping
    public ResponseEntity<List<Musician>> getAllMusiciansAndFilters(
            @RequestParam(required = false, name = "instrument") String instrument) {
        // GET /musicians?instrument=voice
        if (instrument != null){
            return new ResponseEntity<>(musicianRepository.findAll(), HttpStatus.OK);
        }
        // GET /musicians
        return new ResponseEntity<>(musicianRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Musician>> getMusician(@PathVariable Long id) {
        return new ResponseEntity<>(musicianRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Musician>> postMusician(@RequestBody Musician musician) {
        musicianRepository.save(musician);
        return new ResponseEntity<>(musicianRepository.findAll(), HttpStatus.CREATED);
    }

}
