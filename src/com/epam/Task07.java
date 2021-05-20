package com.epam;

public class Task07 {

    public static void main(String[] args) {

        int a, b, c, a1, b1, c1;

        a = -3;
        b = 5;
        c = 6;

        a1 = (int) Math.pow(a, a > 0 ? 2 : 4);
        b1 = (int) Math.pow(b, b > 0 ? 2 : 4);
        c1 = (int) Math.pow(c, c > 0 ? 2 : 4);

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a1 = " + a1 + ", b1 = " + b1 + ", c1 = " + c1);
    }
}