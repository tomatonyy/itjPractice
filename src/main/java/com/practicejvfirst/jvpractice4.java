package src.main.java.com.practicejvfirst;

public class jvpractice4 {

    public static void main(String[] args) {

        /* 배열
        두 가지 방식으로 선언
        자료형[] 변수;
        자료형 변수[];
        */

        //배열 연습 : 100, 200, ....., 700 배열을 임의로 설정
        int[] arr = {100, 200, 300, 400, 500, 600, 700};

        System.out.println(arr[0]); //0번 인덱스의 값은? 100
        System.out.println(arr[1]); //1번 인덱스의 값은? 200
        System.out.println(arr[6]); //6번 인덱스의 값은? 700
        // System.out.println(arr[7]); //7번 인덱스의 값은? Error
        // 인덱스는 0~6번까지이기 때문에 ArrayIndexOutOfBoundsException Error남

        //for문으로 간단히 작성해보기

        for (int k=0; k < arr.length; k++) {
            System.out.println(k + "번째 인덱스 값은?" + arr[k]);
        }

        /*결과:
        0번째 인덱스 값은?100
        1번째 인덱스 값은?200
        2번째 인덱스 값은?300
        3번째 인덱스 값은?400
        4번째 인덱스 값은?500
        5번째 인덱스 값은?600
        6번째 인덱스 값은?700
         */

    }
}
