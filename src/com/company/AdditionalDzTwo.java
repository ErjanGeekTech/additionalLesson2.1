package com.company;

import java.util.Arrays;

public class AdditionalDzTwo {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,7,4,2,6,8,0,1,5,8,9,10};
        int num = numbers.length;

        Arrays.sort(numbers);

        System.out.println(numbers[num - 2]);
    }
}
