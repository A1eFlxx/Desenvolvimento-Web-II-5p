package edu.unipam.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PedidoService {

    @Autowired
      private NotificacaoService notificacaoService;

      PedidoService




    public Boolean finalizarPedido(String pedido) {
        //bla bla bla
        emailService.enviar("O " + pedido + " foi enviado com sucesso.");
        return true;
    }
    
}
