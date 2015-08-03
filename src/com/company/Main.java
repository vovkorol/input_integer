package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        int a = 2;
        System.out.println("Введите целое число");
        if (chislo.hasNextInt())
        {
            a = chislo.nextInt();
            System.out.println("Ви ввели ціле число: " + a);
        }
        else
            System.out.println("Ви ввели не ціле число");
    }
}
