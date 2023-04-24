package src;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Account[] ac;

        String choice = "0";

        outer: while(true){
            System.out.println("---------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택> ");
            choice = sc.nextLine();
            
            switch(choice){
                case "1":
                    
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    ac.set
                    
                case "2":
                case "3":
                case "4":
                case "5":
                    break outer;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        }
    }   
}
