package ru.gb.marinrs.HomeWork6;

abstract class Animal {

    private double distanceRun;
    private double distanceSwim;
    private static int count;

    public Animal(double distanceRun, double distanceSwim) {
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        count++;
    }

    public double getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(double distanceRun) {
        this.distanceRun = distanceRun;
    }

    public double getDistanceSwim() {
        return distanceSwim;
    }

    public void setDistanceSwim(double distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }


    abstract void isRunAnimal();

    abstract void isSwimAnimal();
}
