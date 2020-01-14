package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	//private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl(SpeakerRepository repository) {
		this.repository = repository;
	}
	
	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}

	public List<Speaker> findAll(){
		return repository.findAll();
	}
	
}
