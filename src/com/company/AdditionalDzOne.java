package com.company;

import java.util.Scanner;

public class AdditionalDzOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 0) {
            long l = number % 10;
            System.out.print(l);
            number /= 10;
        }
        if (number < 0){
            System.out.println("Вы ввели отрицательное число");
        }
    }
}
