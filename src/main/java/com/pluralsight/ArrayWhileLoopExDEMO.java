package com.pluralsight;

public class ArrayWhileLoopExDEMO {

    public static void main(String[] args) {
       int[] numbers = {54,77,88,99,12,83};

       int index = 0;

        while (index< numbers.length) {
            int currentNumber = numbers[index];
            System.out.println(currentNumber);
            index = index + 1;
        }
    }
}
