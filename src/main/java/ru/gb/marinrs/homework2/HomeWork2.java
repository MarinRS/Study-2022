package ru.gb.marinrs.homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(compareSum(5, 6));
        System.out.println(compareValuePlus(-8));
        System.out.println(compareValuePlusMinus(-37));
        System.out.println(printStringValue(4, "Hit the Road Jack!"));
        System.out.println(yearLeap(600));
    }

    public static boolean compareSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static String compareValuePlus(int a) {
        if (a >= 0) {
            return "Положительное";
        }
        return "Отрицательное";
    }

    public static boolean compareValuePlusMinus(int a) {
        return (a >= 0);
    }

    public static String printStringValue(int a, String b) {
        for (int i = 1; i < a; i++) {
            System.out.println(b);
        }
        return b;
    }

    public static boolean yearLeap(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }
}