package ru.gb.marinrs.HomeWork1;

public class Treadmill implements Barrier {
    private int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void overcome(Player player) {
    player.run(this);
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return ("Беговая дорожка длинной "+lenght+ " метров");
    }
}
