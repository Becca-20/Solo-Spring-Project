package com.example.music.repository;

import com.example.music.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConcertRepository extends JpaRepository<Concert, Long> {

    // find all concerts with a capacity greater an 300
    List<Concert> findByCapacityGreaterThan(int capacity);

}
