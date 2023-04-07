package chapter02;

import java.util.ArrayList;
import java.util.Calendar;

/*Java предоставляет оператор instanceof для проверки того, принадлежит ли объект определенному типу или подклассу этого типа.
  Затем программа может выбрать, приводить или не приводить этот объект соответственно.*/
class People{
    String name;

    public People(String name) {
        this.name = name;
    }
}
class Teacher extends People{
    Teacher(String name){
        super(name);
    }
}
class Student extends People{
    Student(String name){
        super(name);
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        ArrayList<People> peoples = new ArrayList<>();
        peoples.add(new Teacher("Ivan"));
        peoples.add(new Teacher("Alexey"));
        peoples.add(new Teacher("Anastasia"));
        peoples.add(new Student("Anna"));
        peoples.add(new Student("Semyon"));
        int countT = 0;
        int countS = 0;
        for (People p: peoples) {
            if (p instanceof  Teacher){
                countT++;
            }
            if(p instanceof Student){
                countS++;
            }
        }
        System.out.println("countT = " + countT);
        System.out.println("countS = " + countS);
    }
}
