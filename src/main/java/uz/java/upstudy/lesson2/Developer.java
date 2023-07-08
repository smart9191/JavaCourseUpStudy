package uz.java.upstudy.lesson2;

public class Developer extends Employer {
    private String language;

    public Developer() {

    }

    public Developer(String name, int age) {
        super(name, age);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void writeCode() {
        System.out.println( " is working");
    }

}
