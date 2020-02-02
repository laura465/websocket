package it.sisal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import it.sisal.model.Greeting;
import it.sisal.model.IdMessage;
import it.sisal.model.Persona;
import it.sisal.service.Servizio;


@Controller
public class PersonaController {
	
	@Autowired // Questa annotazione consente a Spring di risolvere e iniettare bean
	private Servizio service;

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public  Greeting greeting(IdMessage message, Persona persona) throws Exception {
		return new Greeting(HtmlUtils.htmlEscape(service.corrispondente(message.getId())));
		//new Greeting(HtmlUtils.htmlEscape(message.getId()));
		// + HtmlUtils.htmlEscape(message.getName()) +
	}

}
