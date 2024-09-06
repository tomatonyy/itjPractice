import java.util.Scanner;

public class jvpractice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("100 ~ 500 중에 정수 하나를 입력하세요.");
        int num = sc.nextInt();

        System.out.println("=====첫번째 if문=====");
        if(num%2 != 0) {
            System.out.println("입력하신 값은 홀수입니다.");
        } else{
            System.out.println("짝수입니다."); //boolean조건만 사용
        }
        System.out.println("프로그램을 마칩니다.");

        System.out.println("======두번째 if문======");

        if(num%2 == 1) {
            System.out.println("입력하신 값은 홀수예요."); //else를 생략해봄
        }

        /* 301 입력했을 때:
        =====첫번째 if문=====
        입력하신 값은 홀수입니다.
        프로그램을 마칩니다.
        ======두번째 if문======
        입력하신 값은 홀수예요.
        */

    }
}
