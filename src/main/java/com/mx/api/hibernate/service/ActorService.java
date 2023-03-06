package com.mx.api.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.api.hibernate.models.Actores;
import com.mx.api.hibernate.models.ActoresBiografia;
import com.mx.api.hibernate.repository.ActoresBiografiaRepository;
import com.mx.api.hibernate.repository.ActoresRepository;

@Service
public class ActorService {
	
	@Autowired
	public ActoresRepository actor;
	
	@Autowired
	public ActoresBiografiaRepository actorBio;
	
	public List<ActoresBiografia> allActores() {
		return actorBio.allActores();
	}
	
	public Integer postActor(Actores newActor) {
		actor.save(newActor);
		return 1;
	}
}
