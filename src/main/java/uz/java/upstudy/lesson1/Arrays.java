package uz.java.upstudy.lesson1;

public class Arrays {

    public static void main(String[] args) {

        int [] mass = new int[10];
        mass[0] = 1;
        mass[1] = mass[2] = mass[3] = mass[0]++;

        for (int i = 4; i < mass.length; i++) {
            mass[i] = i;
        }

        for (int a : mass) {
            System.out.println(a);
        }

    }

}
