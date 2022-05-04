package ru.gb.marinrs.HomeWork6;

public class HomeWork6 {
    public static void  main (String[] args){
    Animal [] animal = new Animal[10];

    animal[0]=new Cat(210,5,"Муся");
        animal[1]=new Cat(200,4,"Дуся");
        animal[2]=new Cat(190,3,"Алиса");
        animal[3]=new Cat(180,2,"Лариса");
        animal[4]=new Cat(170,1,"Анфиса");
        animal[5]=new Cat(160,0,"Маня");
    animal[6]=new Dog(466,12,"Полкан");
        animal[7]=new Dog(476,11,"Рекс");
        animal[8]=new Dog(486,10,"Тузик");
        animal[9]=new Dog(496,9,"Лорд");


        for (int i = 0; i < animal.length; i++) {
            animal[i].isRunAnimal();
            animal[i].isSwimAnimal();
            System.out.println();
                    }
        System.out.println("Создано кошек: "+Cat.getCount()+" Создано собак: "+Dog.getCount());

    }
}
