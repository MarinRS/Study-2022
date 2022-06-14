package ru.gb.marinrs.HomeWork1;

public interface Player {
    int getJumpLimit ();
    int getRunLimit ();
    void setPlay (boolean play);
    default void run(Treadmill treadmill){
        if (isPlay()){
            if (getRunLimit()>=treadmill.getLenght()){
               // System.out.println(this + " успешно преодолел "+ treadmill);
            }else {
               // System.out.println(this + " не прошел препятствие"+treadmill);
                setPlay(false);
            }
        }
    }

    default void jump(Wall wall){
        if (isPlay()){
            if (getJumpLimit()>=wall.getHeight()){
                //System.out.println(this + " успешно преодолел "+ wall);
            }else {
               // System.out.println(this + " не прошел препятствие");
                setPlay(false);
            }
        }
    }

    boolean isPlay();
}
