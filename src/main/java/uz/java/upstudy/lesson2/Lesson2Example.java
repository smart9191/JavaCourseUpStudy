package uz.java.upstudy.lesson2;

public class Lesson2Example {

    public static void main(String[] args) {

        int a = 5;
        Employer employer = new Employer();
        employer.name = "Dilshodbek";
        employer.age = 32;
        System.out.println(employer);
        employer.work();

        Employer employer2 = new Employer();
        employer2.name = "Salohiddin";
        employer2.age = 33;
        System.out.println(employer);
        employer2.work();
    }

}
