package com.pluralsight;

public class ArrayForLoopExDEMO {

    public static void main(String[] args) {
        int[] numbers ={54,77,88,99,12,83};

        for (int index = 0;index< numbers.length ;index = index+1) {
            int currentNumber = numbers[index];
            System.out.println(currentNumber);
        }


        for (int currentNumber: numbers) {
            System.out.println(currentNumber);
        }
    }
}
