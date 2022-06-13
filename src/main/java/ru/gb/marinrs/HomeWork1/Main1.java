package ru.gb.marinrs.HomeWork1;

public class Main1 {
    public static void main(String[] args) {
        Team teams = new Team("Валики");
       teams.teamInfo();
       Course course = new Course();
        course.doIt(teams);
        System.out.println("\n"+"<<<< Результаты >>>>");
        teams.overcomeInfo();
    }
}
