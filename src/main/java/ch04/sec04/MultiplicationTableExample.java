package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int m = 2; m <= 9; m++) {
            for (int n = 1; n <= 9; n++) {
                System.out.printf("%d x %d = %2d   ", m, n, m * n);
            }
            System.out.println();
        }
    }
}
