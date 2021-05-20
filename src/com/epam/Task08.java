package com.epam;

import java.util.Random;

public class Task08 {

    public static void main(String[] args) {
        final Random random = new Random();
        int x, y;
        boolean result;

        x = random.nextInt(200) * (random.nextInt(2) % 2 == 0 ? -1 : 1);
        y = random.nextInt(200) * (random.nextInt(2) % 2 == 0 ? -1 : 1);

        if (((x > -100 & x < 100) & (y > -50 & y < 0)) |
                ((x > -50 & x < 50) & (y > 0 & y < 50))) {
            result = true;
        } else {
            result = false;
        }
        System.out.println("x = " + x + ", y = " + y + ". RESULT = " + result + ". Точка (" + x + ", " + y + ") " + (result ? "" : "не") + "принадлежит закрашенной области.");
    }
}