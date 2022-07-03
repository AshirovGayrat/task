package com.company;

public class Task1 {
    public static void result(int[][] jadval) {

        int[] location = location(jadval);
        if (location==null){
            return;
        }

        int location1 = Math.abs(3 - location[0]);
        int location2 = Math.abs(3 - location[1]);

        System.out.println("Steps:  " + (location1+location2));
    }


    public static int[] location(int[][] jadval) {
        for (int i = 0; i < jadval.length; i++) {
            for (int j = 0; j < jadval[0].length; j++) {
                if (jadval[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
