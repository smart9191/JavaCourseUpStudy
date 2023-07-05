package uz.java.upstudy.lesson1;

public class Variables {
    public static void main(String[] args) {

       int i = 1;
       long l = 2L;
       double d = 3.3d;
       boolean b;

        b = true; // O'zlashtirish
        i++;      // Unar operatsiya
        i = i + 1; // Binar operatsiya
        i += 1;    // kombinatsiyali operatsiya

        b = i > 5; // Solishtirish

        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println(i+d);

    }
}
