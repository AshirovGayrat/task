package com.company;

public class Task3 {
    public static void result(String text) {

        char[] shifr = {
                't', 'c', 'd', 'o', 'p', 'y',
                'g', 'e', 'f', 'o', 'p', 'a', 'z',
                'p', 'l', 'q', 'p', 's', 't', 'e',
                'f', 'w', 'v', 'y', 'x', 'm'};

        char[] charArray = {
                'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};

        char[] inputCharArray = text.toCharArray();

        System.out.println(shifr(inputCharArray, shifr, charArray));
    }


    public static String shifr(char[] inputCharArray, char[] shifr, char[] charArray){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < inputCharArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (inputCharArray[i]==charArray[j]){
                    builder.append(shifr[j]);
                }
            }
        }
        return builder.toString();
    }

}
