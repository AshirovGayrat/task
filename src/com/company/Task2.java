package com.company;

public class Task2 {

    // Bu xato ishlidi, Bu variant sonni ichida nechta nol borligini aniqlidi
    public static void variant1(int n) {
        if (n>1018){
            System.out.println("Wrong number!");
            return;
        }

        int temp = tubSonlarKopaytmasi(n);
        int count = 0;
        for (long i = temp; i != 0; i = i / 10) {
            if (i % 10 == 0) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    //Bu to`g`ri ishlidi, son nechta nol bilan tugashini aniqlidi
    public static void variant2(int n) {
        if (n>1018){
            System.out.println("Wrong number!");
            return;
        }

        String str = String.valueOf(tubSonlarKopaytmasi(n));
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') count++;
            else break;
        }
        System.out.println("Count: "+count);
    }


    public static int tubSonlarKopaytmasi(int n) {
        int count = 0, result = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) {
                result *= i;
            }
            count = 0;
        }
        return result;
    }

}
