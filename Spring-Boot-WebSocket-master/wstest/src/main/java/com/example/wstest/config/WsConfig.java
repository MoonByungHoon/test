package com.example.wstest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
//웹 소켓을 활성화 하기 위한 필수 어노테이션이다.
//이를 사용하기 위해서는 아래 두 메소드를 오버라이딩 해야한다.
@EnableWebSocketMessageBroker
public class WsConfig implements WebSocketMessageBrokerConfigurer{

  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    registry.addEndpoint("/javatechie").withSockJS();
  }

  //	메세지 브로커를 구성하는 메소드이다.
//	메모리 내에 메세지 브로커가 "/topic" 접두사가 붙은 대상에서 클라이언트로
//	메세지를 다시 전달할 수 있도록 해준다.
  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry) {
    registry.enableSimpleBroker("/topic");
    registry.setApplicationDestinationPrefixes("/app");
  }
}
