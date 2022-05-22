package ru.gb.marinrs.HomeWork7;
/*1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
 а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.*/


import java.util.Scanner;

public class HomeWork7 {


    public static <cat> void main(String[] args) {
int newPortionFood;
        Cat[] cats = {
                new Cat("Барсик", 10,false),
                new Cat("Борис", 130, false),
                new Cat("Мусик", 40, false),
        };
        Plate plate = new Plate(140);
        plate.info();
        for (Cat cat:cats) {
            cat.info();
            if (!cat.isSatiety()&&cat.getAppetite()<= plate.getFood()){
            cat.eat(plate);
                System.out.println("Кот "+cat.getName()+" поел!");
                            }
            else {
                System.out.println("Кот "+cat.getName()+" не поел!");
            }
                        plate.info1();
        }
            System.out.println("Коты поели. Введите количество единиц корма для добавления в миску?");
        Scanner sc = new Scanner(System.in);
        newPortionFood = sc.nextInt();
                plate.putFoodInPlate(newPortionFood);
        plate.info();
    }

}