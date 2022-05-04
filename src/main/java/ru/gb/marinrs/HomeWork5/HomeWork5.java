package ru.gb.marinrs.HomeWork5;

public class HomeWork5 {
    public static void  main (String[] args){


        Employee [] employee = new Employee[6];

        employee [0] = new Employee("Иванов Иван Иванович","Генеральный " +
                "директор","boss@company.com",  890012346789L,100000,45);
        employee[1]=new Employee("Петров Петр Петрович","Главный инженер",
                "petrov@company.com",890023456789L,90000,40);
        employee[2]=new Employee("Сидоров Петр Иванович","Главный юрист",
                "petrov@company.com",890034567890L,90000,35);
        employee[3]=new Employee("Галустян Марине Шафиковна","Главный " +
                "бухгалтер",
                "galystian@company.com",89000000001L,95000,37);
        employee[4]=new Employee("Борисов Федор Петрович","Сторож",
                "borisov@company.com",891245673890L,25000,70);
        employee[5]=new Employee("Осипова Полина Федоровна","Уборщица",
                "petrov@company.com",890023456789L,20000,65);

    for (int i=0;i< employee.length;i++){
        if (employee[i].getAge()>40){
                employee[i].printEmployee();
        }
            }
}

}
