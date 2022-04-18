package ru.gb.marinrs;

public class Main {
    public static void main(String[] args) {

        System.out.println(yearLeap(200));
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
