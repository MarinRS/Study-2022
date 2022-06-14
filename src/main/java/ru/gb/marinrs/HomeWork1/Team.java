package ru.gb.marinrs.HomeWork1;

import java.util.Arrays;
import java.util.Random;

public class Team {

    private String nameTeam;
    public Player [] teamPlayers = new Player[4];
    Random random =new Random();
    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
       teamPlayers [0] = new Cat("Мурзик",100,2);
       teamPlayers [1] = new Human("Василий",200,1);
       teamPlayers [2] = new Robot("R2D2",2000,15);
       teamPlayers [3] = new Human("Георгий",300,2);
    }

    public void teamInfo (){
        System.out.println("Команда <<" +nameTeam+">> в составе: ");
        System.out.println();
        for (Player team: teamPlayers) {
            System.out.println(team + ". Характеристики:" + " Бег: " +team.getRunLimit()+ " м,"+ " Прыжок " + team.getJumpLimit()+ " м.");
                               }

    }

    public void overcomeInfo (){
        System.out.println();
        for (Player team:teamPlayers) {
            if (team.isPlay()) System.out.println(team + ". Прошел полосу препятствий");
            else System.out.println(team + ". Не прошел полосу препятствий");

        }
    }

}
