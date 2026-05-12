package org.cuatrovientos.ed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorIptest {

    private GeneradorIp generador;

    @BeforeEach
    void setUp() {
        generador = new GeneradorIp();
    }

    @Test
    void testGenerarNumero() {
        for (int i = 0; i < 1000; i++) {
            int numero = generador.generarNumero(0, 254);
            assertTrue(numero >= 0 && numero <= 254,
                "El número " + numero + " está fuera del rango [0, 254]");
        }
    }

    @Test
    void testGenerarIp() {
        for (int i = 0; i < 1000; i++) {
            String ip = generador.generarIp();
            String[] partes = ip.split("\\.");

            assertNotEquals("0", partes[0], "La IP no debe empezar por 0");
            assertNotEquals("0", partes[3], "La IP no debe terminar en 0");
        }
    }
}