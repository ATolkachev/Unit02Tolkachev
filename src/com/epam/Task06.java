package com.epam;

public class Task06 {
    public static void main(String[] args) {
        double n, m;
        int r;
        int i;
        int f;
        m = 198;
        n = 16;

        r = (int) m / (int) n;
        i = r % 10;
        f = (int) (m / n * 10) % 10;

        System.out.println("M/N=" + m / n);
        System.out.println("Старшая цифра дробной части " + f);
        System.out.println("Младшая цифра целой части " + i);


    }

}