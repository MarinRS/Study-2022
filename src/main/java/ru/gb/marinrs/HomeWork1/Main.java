package ru.gb.marinrs.HomeWork1;

public class Main {
    public static void main(String[] args) {

        Player[] players = {
                new Cat("Мурка", 120, 5),
                new Cat("Борис", 150, 17),
                new Human("Вася", 250, 1),
                new Human("Маруся", 500, 2),
                new Robot("R2D2", 5000, 15),
        };
        Barrier[] barriers = {
                new Wall(4), new Treadmill(120), new Wall(14),
        };
        for (Barrier barrier : barriers) {
            for (Player player : players) {
                barrier.overcome(player);
            }

        }
        System.out.println("<===== УСПЕШНО ФИНИШИРОВАЛИ ====>");

        for (Player player : players) {
            if (player.isPlay()) {
                System.out.println(player);
            }

        }
    }
}
