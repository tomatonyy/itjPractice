package src.main.java.com.practicejvfirst.jvpractice5;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 시스템 요구사항 만들어서 프로그램 만들기

        /* 프로그램 개요
        * 식당에서 요리사가 서빙하는 기계를 작동하는 프로그램
        *
        *
        * 시스템 요구사항
        * 1. 요리사는 전원 켜기, 식탁으로 보내기, 주방으로 되돌아오기, 전원 끄기를 할 수 있다.
        * 2. 서빙 기계는 전원 켜기, 식탁으로 가기, 주방으로 돌아가기, 전원 끄기를 할 수 있다.
        * 3. 기계는 처음에 정지 상태로 대기중이다.
        * 4. 요리사는 먼저 기계의 전원을 켠다. 이미 켜져있으면 다시 전원을 켤 수 없다.
        * 5. 요리사가 보내기를 누르면 전원이 켜진 상태일 경우 기계는 1m/h 증가하며 앞으로 나간다.
        * 6. 기계가 속도가 0으로 떨어지며 식탁에 도착하면 멈춘다.
        * 7. 전원끄기를 누를 때 기계가 꺼져있으면 이미 멈춰있는 상태라고 안내한다.
        * 8. 요리사가 전원을 끄면 정지한다.
        * 9. 기계가 식탁으로 보내지거나 주방으로 되돌아오는 중이면 전원을 켤 수 없다.
         */

        /*  객체간 상호작용
        - 요리사가 수신할 수 있는 메세지 (요리사가 해야 하는 일)
        1. 전원을 켜라
        2. 식탁으로 보내라
        3. 주방으로 돌아와라
        4. 전원을 꺼라
        - 서빙기계가 수신할 수 있는 메세지 (기계가 해야 하는 일)
        1. 전원을 켜라
        2. 식탁으로 가라
        3. 주방으로 돌아가라
        4. 전원을 꺼라
         */

        Chef chef = new Chef();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========요리사의 음식 서빙 프로그램========");
            System.out.println("1. 전원켜기");
            System.out.println("2. 식탁으로 보내기");
            System.out.println("3. 주방으로 되돌아오기");
            System.out.println("4. 전원끄기");
            System.out.println("9. 기계 충전");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : chef.powerOn(); break;
                case 2 : chef.toTable(); break;
                case 3 : chef.comeBack(); break;
                case 4 : chef.powerOff(); break;
                case 9 :
                    System.out.println("충전하러 갑니다."); break;
                default:
                    System.out.println("번호를 다시 선택해주세요."); break;
            }

            if(no == 9) {
                break;
            }
        }






    }
}
