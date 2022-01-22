package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
