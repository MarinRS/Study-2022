package ru.gb.marinrs.HomeWork5;
//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
private String fullName;
private String position;
private String mail;
private long phoneNumber;
private int salary;
private int age;

public Employee (String fullName, String position, String mail, long phoneNumber, int salary, int age) {
this.fullName=fullName;
this.position=position;
this.mail=mail;
this.phoneNumber=phoneNumber;
this.salary=salary;
setAge(age);
}

public String getFullName() {
        return fullName;
    }

     public String getPosition() {
        return position;
    }

    public String getMail() {
        return mail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int   getSalary() {
        return salary;
    }

    public int getAge() {
return age;
           }

    public void setAge(int age) {
        if (age>=0 && age<150) {
            this.age = age;
        }
}
public  void printEmployee(){
    System.out.println("ФИО: " +getFullName()+"\nДолжность: "+getPosition()+"\nE-mail: "+getMail()+"\nТелефон: "+getPhoneNumber()+"\nЗарплата: "+getSalary()+"\nВозраст: "+getAge()+"\n");
}
}