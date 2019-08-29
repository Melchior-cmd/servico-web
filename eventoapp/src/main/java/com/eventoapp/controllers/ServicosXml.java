package com.eventoapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventoapp.models.Evento;

@Controller
public class ServicosXml {
	
	
	@RequestMapping(value="/listarEventosTeste", method=RequestMethod.GET, produces=MediaType.APPLICATION_ATOM_XML_VALUE)
	public ResponseEntity<Iterable<Evento>> allCandidatos() {
		Iterable<Evento> eventos = er.findAll();
		
		
		return new ResponseEntity<Iterable<Evento>>(eventos, HttpStatus.OK);
		 
	}
	
}
