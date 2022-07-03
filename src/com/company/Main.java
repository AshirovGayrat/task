package com.company;

public class Main {

    public static void main(String[] args) {
	// Task 1
        int[][] jadval = {
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},};
        Task1.result(jadval);


        // Task 2 //////////////////////
        int n=5;
        Task2.variant2(n);


        // Task 3 //////////////////////
        String inputText="abcd";
        Task3.result(inputText);

    }
}
