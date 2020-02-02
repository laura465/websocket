package it.sisal.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.sisal.service.Servizio;

@SpringBootTest
class WebSocketApplicationTests {
	
	@Autowired
	private Servizio service;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testServizio() {
		service.corrispondente("1");
	}

}
