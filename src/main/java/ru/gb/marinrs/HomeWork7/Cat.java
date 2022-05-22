package ru.gb.marinrs.HomeWork7;

import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {

        p.decreaseFood(appetite);
    }

    public void info() {
        System.out.println();
        System.out.println("К тарелке подошел кот " + name + ";");
        if (!satiety) {
            System.out.println("Сейчас кот " + name + " голоден и хочет съесть " + appetite + " единиц еды;");
        } else {
            System.out.println("Кот сыт!");
        }
    }

}
