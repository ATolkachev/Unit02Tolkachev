package com.epam;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {

        final Random random = new Random();

        int T = random.nextInt(100000);
        System.out.println("T="+T);

        int h = T / 3600;
        int m = (T - h * 3600) / 60;
        int s = T - h * 3600 - m * 60;

        System.out.println(h + "ч " + m + "мин " + s + "c.");
    }
}