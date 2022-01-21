package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        try {
            System.out.println(DateTimeFormatter.ofPattern("H:mm:ss").format(LocalTime.ofSecondOfDay(input % (24 * 60 * 60))));
        } catch (DateTimeException e) {
            e.printStackTrace();
            System.out.println("Invalid value");
        }
        System.out.println();
    }
}
