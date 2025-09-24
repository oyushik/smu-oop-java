package ch04.sec08;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 16000;

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");
            System.out.println("선택> ");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                System.out.println("예금액> ");
                String strDeposit = scanner.nextLine();
                int deposit = Integer.parseInt(strDeposit);
                balance += deposit;
                System.out.println("예금 후 잔고> " + balance);
            }
            else if (strNum.equals("2")) {
                System.out.println("출금액> ");
                String strWithdrawal = scanner.nextLine();
                int withdrawal = Integer.parseInt(strWithdrawal);
                balance -= withdrawal;
                System.out.println("출금 후 잔고> " + balance);
            }
            else if (strNum.equals("3")) {
                System.out.println("잔고> " + balance);
            }
            else if (strNum.equals("4")) {
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
            }
        }
    }
}
