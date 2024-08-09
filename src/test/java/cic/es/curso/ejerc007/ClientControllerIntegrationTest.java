package cic.es.curso.ejerc007; // Package declaration

import org.junit.jupiter.api.Test; // Importing the Test annotation
import org.springframework.beans.factory.annotation.Autowired; // Importing the Autowired annotation
import org.springframework.boot.test.context.SpringBootTest; // Importing the SpringBootTest annotation
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc; // Importing the AutoConfigureMockMvc annotation
import org.springframework.test.web.servlet.MockMvc; // Importing the MockMvc class

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; // Importing the get method for building GET requests
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; // Importing the content method for result matchers
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; // Importing the status method for result matchers

@SpringBootTest // Annotation to load the full application context for integration testing
@AutoConfigureMockMvc // Annotation to configure MockMvc for testing the web layer
public class ClientControllerIntegrationTest {

    @Autowired // Automatically injecting the MockMvc bean
    private MockMvc mockMvc;

    @Test // Annotation to mark this method as a test case
    public void testGetClient() throws Exception {
        // Performing a GET request to /client/message and expecting a status of OK and content "Got ya"
        mockMvc.perform(get("/client/message"))
                .andExpect(status().isOk())
                .andExpect(content().string("Got ya"));
    }
}