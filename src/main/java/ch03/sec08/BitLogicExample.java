package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("----- AND -----");
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("----------------------------------");

        byte receiveData = -120;

        // 방법 1: 비트 논리곱 연산으로 Unsigned Integer 얻기 (C 언어 스타일)
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        // 방법 2: 자바 API로 Unsigned Integer 얻기 (Java 스타일)
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte bTest = (byte) test;
        System.out.println(bTest);
    }
}
