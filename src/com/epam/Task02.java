package com.epam;
import java.util.Random;

public class Task02 {

    public static void main(String[] args) {
        final Random random = new Random();

        float x = random.nextFloat();
        float y = random.nextFloat();
        System.out.println("x=" + x + " y=" + y);

        if (x < y) {
            float temp = x;
            x = y;
            y = temp;
        }
        System.out.println("x=" + x + " y=" + y);
    }
}