package ru.gb.marinrs.HomeWork6;

public class Dog extends Animal {
    public Dog(double distanceRun, double distanceSwim) {
        super(distanceRun, distanceSwim);
    }

    final String typeAnimal = "Собака";
    private String nameAnimal;
    private static int count;


    public Dog(double distanceRun, double distanceSwim, String nameAnimal) {
        super(distanceRun, distanceSwim);
        this.nameAnimal = nameAnimal;
        count++;
    }


    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public static int getCount() {
        return count;
    }


    @Override
    void isRunAnimal() {
        if (getDistanceRun() >=0 && getDistanceRun() <=500)
        {
            System.out.println(typeAnimal+" по имени "+nameAnimal+" пробежала" +
                            " "+ getDistanceRun()+ " м");
        }else {
            System.out.println(typeAnimal+ " по имени "+nameAnimal+ " не может пробежать такое расстояние");
        }
    }

    @Override
    void isSwimAnimal() {
        if (getDistanceSwim() >=0 && getDistanceSwim() <=10)
        {
            System.out.println(typeAnimal+" по имени "+nameAnimal+" проплыла" +
                    " "+ getDistanceSwim()+ " м");
        }else {
            System.out.println(typeAnimal+ " по имени "+nameAnimal+ " не может проплыть такое расстояние");
                    }

    }
}
