package cic.es.curso.ejerc007.controller; // Package declaration

import cic.es.curso.ejerc007.service.ClientService; // Importing the ClientService class
import org.springframework.beans.factory.annotation.Autowired; // Importing the Autowired annotation
import org.springframework.web.bind.annotation.GetMapping; // Importing the GetMapping annotation
import org.springframework.web.bind.annotation.RestController; // Importing the RestController annotation

@RestController("/client") // Declaring this class as a REST controller with a base path of /client
public class ClientController {

    @Autowired // Automatically injecting the ClientService bean
    private ClientService clientService;

    @GetMapping("/message") // Mapping HTTP GET requests to /client/message to this method
    public String getClient() {
        return clientService.getClientMessage(); // Returning the message from the ClientService
    }
}