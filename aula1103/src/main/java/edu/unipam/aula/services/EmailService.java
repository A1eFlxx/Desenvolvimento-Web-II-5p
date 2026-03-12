package edu.unipam.aula.services;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
    
}
