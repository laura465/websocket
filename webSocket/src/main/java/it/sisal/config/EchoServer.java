package it.sisal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
/* Classe che implementa WSMBC. 
 * configureMessageBroker Configura le opzioni del broker dei messaggi
 */

@Configuration
@EnableWebSocketMessageBroker //migliore gestione dei messaggi scambiati
public class EchoServer implements WebSocketMessageBrokerConfigurer {

	@Override //riscrittura di un metodo ereditato
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic");//abilita lo scambio dei messaggi e configura un prefisso
		config.setApplicationDestinationPrefixes("/app");//Configura  prefissi per filtrare le destinazioni destinate ai metodi con annotazioni dell'applicazione
	}

	@Override
	/*Registra gli endpoint STOMP mappandoli ciascuno 
	 * su un URL specifico e abilitando e configurando le opzioni di fallback di SockJS.
	 */
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/gs-guide-websocket").withSockJS();
	}


}
