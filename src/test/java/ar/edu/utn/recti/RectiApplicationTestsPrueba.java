package ar.edu.utn.recti;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")   // <-- fuerza a usar H2 y la config de test

public class RectiApplicationTestsPrueba {

    @Test
    void contextLoads() {
    }
}
