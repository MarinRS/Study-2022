package ru.gb.marinrs.HomeWork7;

import java.util.Scanner;

public class Plate {
    public int getFood() {
        return food;
    }

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("В тарелке : " + food + " единиц еды;");

    }

    public void info1() {
        System.out.println("В тарелке осталось: " + food + " единиц еды;");
        System.out.println();
    }

    public void putFoodInPlate(int x) {
        food += x;
    }
}
