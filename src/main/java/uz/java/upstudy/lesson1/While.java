package uz.java.upstudy.lesson1;

public class While {

    public static void main(String[] args) {

        int a = 1;

        do {
            System.out.println("do-while: a = " + ++a);
        }while (a < 0);

        while (a > 0) {
            System.out.println("while: a = " + a--);
        }

    }

}
