package org.cuatrovientos.ed;

import java.util.Random;

public class GeneradorIp {

    private Random random = new Random();

    public int generarNumero(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public String generarIp() {
        int a, b, c, d;

        do { a = generarNumero(0, 254); } while (a == 0);
        b = generarNumero(0, 254);
        c = generarNumero(0, 254);
        do { d = generarNumero(0, 254); } while (d == 0);

        return a + "." + b + "." + c + "." + d;
    }
}