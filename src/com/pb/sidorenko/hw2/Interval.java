package com.pb.sidorenko.hw2;

import java.util.Scanner;

public class Interval {
    private static Scanner in;

    public static void main(String[] args) {

        byte a = 0, b = 14, d = 15, e = 35, o = 36, r = 50, h = 51, j = 100;

        System.out.print("\n" + "Введите любое целое число до 100: ");

        in = new Scanner(System.in);
        byte i = in.nextByte();

        if (i >= a && i <= b) {
            System.out.print("число " + i + " попадает в интервал от " + a + " до " + b);
        } else if (i >= d && i <= e) {
            System.out.print("число " + i + " попадает в интервал от " + d + " до " + e);
        } else if (i >= o && i <= r) {
            System.out.print("число " + i + " попадает в интервал от " + o + " до " + r);
        } else  if (i >= h && i <= j) {
            System.out.print("число " + i + " попадает в интервал от " + h + " до " + j);
        }
    }
}

