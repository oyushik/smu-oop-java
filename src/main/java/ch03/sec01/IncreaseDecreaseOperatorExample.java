package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // x = x + 1;
        ++x; // x = x + 1;
        System.out.println("x = " + x);

        System.out.println("-----------------");
        y--; // y = y - 1;
        --y; // y = y - 1;
        System.out.println("y = " + y);

        System.out.println("-----------------");
        z = x++; // z = x; x = x + 1;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("-----------------");
        z = ++x; // x = x + 1; z = x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("-----------------");
        z = ++x + y++; // z = ++x + y; y = y + 1;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
