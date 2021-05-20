package com.epam;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        final Random random = new Random();
        float x1, y1, x2, y2;
        x1 = 10*random.nextFloat() * (random.nextInt(2) % 2 == 0 ? -1 : 1);
        x2 = 10*random.nextFloat() * (random.nextInt(2) % 2 == 0 ? -1 : 1);
        y1 = 10*random.nextFloat() * (random.nextInt(2) % 2 == 0 ? -1 : 1);
        y2 = 10*random.nextFloat() * (random.nextInt(2) % 2 == 0 ? -1 : 1);

        float len = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Расстояние между двумя точками (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ") равно " + len);
    }
}