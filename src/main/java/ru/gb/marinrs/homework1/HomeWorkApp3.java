package ru.gb.marinrs.homework1;

public class HomeWorkApp3 {

    public static void  checkSumSign(){
        int a = 8;
        int b = 16;
        if (a+b>=0){
            System.out.println("сумма положительна!");
        } else {
            System.out.println("сумма отрицательна!");
        }
    }

    public static void main(String[] args){
        checkSumSign();
    }

}
