package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        // Java 12 이전 문법
        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                score1 = 80;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);

        // Java 12 이후 문법
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result; // yield 키워드를 사용하여 값을 반환
            }
            default -> 60;
        };
        System.out.println("score2: " + score2);
    }
}
