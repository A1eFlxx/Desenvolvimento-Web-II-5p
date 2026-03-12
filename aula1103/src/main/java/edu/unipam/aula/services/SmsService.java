package edu.unipam.aula.services;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements NotificacaoService {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
    
}


