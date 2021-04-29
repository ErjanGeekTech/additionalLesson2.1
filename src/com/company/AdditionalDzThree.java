package com.company;

import java.util.Scanner;

public class AdditionalDzThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальный диапазон: ");
        int num = scanner.nextInt();
        int save = num;
        System.out.print("Введите конечный диапазон: ");
        int maxChek = scanner.nextInt();
        String primeNumbers = "";

        for (int i = 1; i <= maxChek; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Натуральные числа между " + save + " и " + maxChek + ":");
        System.out.println(primeNumbers);
    }
}
