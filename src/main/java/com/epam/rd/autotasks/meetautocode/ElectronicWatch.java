package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours, sec, minutes;
        if (seconds >= 86400) {
            hours = 0;
            minutes = (seconds % 86400) / 60;
            sec = seconds % 60;
        } else {
            hours = seconds / 3600;
            minutes = seconds % 3600 / 60;
            sec = seconds % 60;
        }
        System.out.printf("%2d:%02d:%02d", hours, minutes, sec);
    }
}
