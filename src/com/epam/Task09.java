package com.epam;

import java.util.Random;
public class Task09 {

    public static void main(String[] args) {
        final Random random = new Random();

        int x;
        double result;

        x = random.nextInt(100) * (random.nextInt(2)%2==0? -1: 1);

        if (x <= -3) // code convention - не пропускай {}, даже если синтаксис позволяет
            result = 9;
        else
            result = 1 / (Math.pow(x, 2) + 1);

        System.out.println("x = " + x + "; result = " + result);
    }// Молодец
}
