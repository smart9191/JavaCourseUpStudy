package uz.java.upstudy.lesson2;

public class Employer {

    String name;
    int age;

    public Employer(){

    }

    public Employer(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println(this.name + " is working");
    }

}
