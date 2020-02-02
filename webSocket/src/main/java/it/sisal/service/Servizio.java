package it.sisal.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import it.sisal.model.Persona;

@Service //servizio o dominio
public class Servizio implements ServiceInterface {

	public String corrispondente(String id) {

		Persona a [] = new Persona[10];
		a [0]= new Persona("1","Marco",35);
		a [1]= new Persona("2","Antonio",32);
		a [2]= new Persona("3","Cristiana",25);
		a [3]= new Persona("4","Daniele",28);
		a [4]= new Persona("5","Mario",23);
		a [5]= new Persona("6","Andrea",23);
		a [6]= new Persona("7","Francesco",26);
		a [7]= new Persona("8","Giorgio",28);
		a [8]= new Persona("9","Laura",25);
		a [9]= new Persona("10","Sara",30);

		boolean trovato=false;
		Persona cercata=null;
		String res= "";
		
			for(int i=0 ; i<a.length ; i++) {
				cercata= a [i];
		if(cercata.getId().equals(id)) {
			trovato = true;
			res= "la persona cercata è" + cercata ;
		}	
	}
	if(!trovato) {
		res= "la persona cercata non esiste";
	}

	return res;
}

}
