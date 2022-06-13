package ru.gb.marinrs.HomeWork1;

public class Cat implements Player {
    private  String name;
    private  int runLimit;
    private  int jumpLimit;

    private boolean play;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play=true;
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }


    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }


    @Override
    public void setPlay(boolean play) {
        this.play = play;
    }
    @Override
    public boolean isPlay() {
        return play;
    }

    @Override
    public String toString() {
        return "Кот по имени "+ name;
    }
}
