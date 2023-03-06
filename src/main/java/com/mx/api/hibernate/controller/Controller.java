package com.mx.api.hibernate.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.api.hibernate.models.Actores;
import com.mx.api.hibernate.models.ActoresBiografia;
import com.mx.api.hibernate.service.ActorService;

@RestController
@RequestMapping(value = "/actor")
public class Controller {

	private static final Logger Log = LoggerFactory.getLogger(Controller.class);

	@Autowired
	ActorService actorService;

	@GetMapping(value = "/allactores", produces = "application/json")
	public ResponseEntity<List<ActoresBiografia>> allActores() {
		Log.info("allActores()");

		try {
			return new ResponseEntity<List<ActoresBiografia>>(actorService.allActores(), HttpStatus.OK);
		} catch (Exception e) {
			Log.error(e.getMessage());
			return new ResponseEntity<List<ActoresBiografia>>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(value = "/postactor")
	public ResponseEntity<Integer> postActor(@RequestBody Actores newActor) {
		Log.info("postActor()");
		
		try {
			return new ResponseEntity<Integer>(actorService.postActor(newActor), HttpStatus.OK);
		} catch(Exception e) {
			Log.error(e.getMessage());
			return new ResponseEntity<Integer>(HttpStatus.BAD_REQUEST);
		}

	}

}
