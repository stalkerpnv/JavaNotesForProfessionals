package chapter03;

class Person{
/*    We can't access the count variable because it's private. But we can access the getCount() and the setCount(int)
    methods because they are public.*/
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name!=null && name.length()>2){
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }
    }

}

public class GetterSetterExample {
    public static void main(String[] args) {
        Person personOne = new Person("Ivan",10);
        System.out.println(personOne.getName() + " " +personOne.getAge());
        personOne.setName("John");
        personOne.setAge(0);
        System.out.println(personOne.getName() + " " + personOne.getAge());
    }
}
