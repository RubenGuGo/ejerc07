package cic.es.curso.ejerc007.controller;

import cic.es.curso.ejerc007.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/message")
    public String getClient() {
        return clientService.getClientMessage();
    }
}