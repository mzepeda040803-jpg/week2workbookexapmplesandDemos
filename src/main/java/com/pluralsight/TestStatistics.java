package com.pluralsight;

public class TestStatistics {

    public static void main(String[] args) {
        int[] testScores = {88,67,92,95,99,32,65,76,66,80};

        int sum = 0;

        int highNumber = testScores[4];
        System.out.println(highNumber);

        int lowNumber = testScores[5];
        System.out.println(lowNumber);

        for (int score: testScores) {
            sum += score;
        }

        //System.out.println((highNumber + lowNumber) / 10);
        double average = (double) sum / testScores.length;
        System.out.println("Average score: " + average);
        System.out.println("High score: " + highNumber );
        System.out.println("Low score: " + lowNumber);




    }
}
