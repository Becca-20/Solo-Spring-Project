package com.example.music.components;

import com.example.music.model.Concert;
import com.example.music.model.Musician;
import com.example.music.repository.ConcertRepository;
import com.example.music.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MusicianRepository musicianRepository;

    @Autowired
    ConcertRepository concertRepository;

    public DataLoader () {
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        // CONCERTS
//
//        Musician m1 = new Musician("Aurora", 03, "voice", 8);
//        Musician m2 = new Musician("Gerald Fleep", 65, "violin", 5);
//        Musician m3 = new Musician("Pam Beesley", 22, "french horn", 2);
//        Musician m4 = new Musician("Jim Halpert", 61, "guitar", 5);
//        Musician m5 = new Musician("Dwight Schrute", 31, "recorder", 8);
//        Musician m6 = new Musician("Andy Bernard", 90, "banjo", 7);
//        Musician m7 = new Musician("Creed Bratton", 23, "bass guitar", 6);
//
////        musicianRepository.saveAll(m1,m2,m3,m4,m5,m6,m7);
//
//        // MUSICIANS
//
//        Concert c1 = new Concert("String Sleep", false, 50);
//        Concert c2 = new Concert("Cool Jams", true, 359);
//        Concert c3 = new Concert("Toot Toot Tooters", false, 500);
//        Concert c4 = new Concert("Sounds like the Wind", true, 1050);
//        Concert c5 = new Concert("Old Timey Sounds", false, 10);
//
////        concertRepository.saveAll(c1,c2,c3,c4,c5);
//    }

}
