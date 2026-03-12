package edu.unipam.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unipam.aula.services.PedidoService;


@RestController
public class MainController {

    @Autowired

    PedidoService pedidoService;
    
    @GetMapping("/hello")
    public String get() {
        return "HELLO";
    }

    @GetMapping("/finalizar")
    public void finalizar() {
       pedidoService.finalizarPedido("celular");
    }


}