package cic.es.curso.ejerc007.service; // Package declaration

import org.springframework.stereotype.Service; // Importing the Service annotation

@Service // Declaring this class as a Spring service component
public class ClientService {

    // Method to return a client message
    public String getClientMessage() {
        return "Got ya"; // Returning the message "Got ya"
    }
}