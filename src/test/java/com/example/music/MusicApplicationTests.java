package com.example.music;

import com.example.music.model.Concert;
import com.example.music.repository.ConcertRepository;
import com.example.music.repository.MusicianRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class MusicApplicationTests {

	@Autowired
	MusicianRepository musicianRepository;
	ConcertRepository concertRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindConcertCapacityOver300() {
		List<Concert> found = concertRepository.findByCapacityGreaterThan(300);
		assertThat(found.size()).isEqualTo(3);
	}

}
