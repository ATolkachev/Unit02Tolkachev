package com.epam;

import java.lang.Math;

public class Task05 {

    public static void main(String[] args) {
        double x = 198;
        double y = 57;

        double res1, res2, res3;

        res1 = Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y));
        res2 = Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y));
        if (res2 == 0) {
            System.out.println("Деление на 0");
        } else {
            if (x * y == 90 | x * y == 270) {
                System.out.println("Тангенс для угла 90  и 270 градусов  неопределён");
            } else {
                res3 = res1 / res2 * Math.tan(Math.toRadians(x * y));
                System.out.println(Math.round(res3));
            }
        }
    }
}