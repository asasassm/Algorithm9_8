package com.nhnacademy.reverse;

public class ex {

    public static void main(String[] args) {

        computer(123);
    }

    public static void solution(int a) {
        int result = 0;
        int[] reversA = {};

        int first = a;

        String reA = "";
        String reB = "";
        int reverse = 0;
        while (a != 0) {
            int temp = a % 10;
            reverse = reverse * 10 + temp;
            a /= 10;
        }
        System.out.println(reverse);

    }

    public static void computer(int a) {
        String s = String.valueOf(a);
        char[] c = new char[s.length()];
        String re = "";
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            c[j] = s.charAt(i);
            re += c[j];
        }
        System.out.println(re);
    }

}

