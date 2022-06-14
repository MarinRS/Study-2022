package ru.gb.marinrs.HomeWork1;

public class Course {

    public Barrier [] courseOne = new Barrier[3];


    public Course() {
        this.courseOne[0] = new Wall(3);
        this.courseOne[1] = new Treadmill(40);
        this.courseOne[2] = new Wall(2);
                         }

     public void  doIt(Team team){
     for (Player player: team.teamPlayers) {
         for (Barrier barrier : courseOne) {
             barrier.overcome(player);
             if (!player.isPlay()) break;
         }
     }
 }
}
