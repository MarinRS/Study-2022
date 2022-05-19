package ru.gb.marinrs.HomeWork7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >n) {
            food -= n;
        }  else {
            System.out.println("В тарелке недостаточно еды. Котик гордый,котик есть не будет;");

        }
        return;
    }
    public void info() {
        System.out.println("В тарелке : " + food + " единиц еды;");
        System.out.println();
    }
    public void info1() {
                System.out.println("В тарелке осталось: " + food + " единиц еды;");
        System.out.println();
    }
   /*public void putFoodInPlate (){
        Scanner sc = new Scanner(System.in);
       int food1 = 0;
        food1 = sc.nextInt(food1);
        food+=food1;
    }*/
}
